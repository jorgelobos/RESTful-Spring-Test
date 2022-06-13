/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dao;

import com.falabella.restfulapi.dto.Product;
import com.falabella.restfulapi.idao.IUpdate;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jorge
 */
@RestController
public class Update {

    private final IUpdate update;
    private final ProductModelAssembler assembler;
    
    Update(IUpdate update, ProductModelAssembler assembler) {
        this.update = update;
        this.assembler = assembler;
    }

    @PutMapping("/products/{productId}")
    ResponseEntity<?> updateProduct(@RequestBody Product newProduct, @PathVariable Integer productId) {
        Product updatedProduct = update.findById(productId)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setBrand(newProduct.getBrand());
                    product.setSize(newProduct.getSize());
                    product.setPrice(newProduct.getPrice());
                    product.setPrincipalImage(newProduct.getPrincipalImage());
                    product.setOtherImages(newProduct.getOtherImages());
                    return update.save(product);
                })
                .orElseGet(() -> {
                    newProduct.setId(productId);
                    return update.save(newProduct);
                });
        
        EntityModel<Product> entityModel = assembler.toModel(updatedProduct);

        return ResponseEntity
            .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
            .body(entityModel);
    }
}
