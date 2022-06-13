/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dao;

import com.falabella.restfulapi.dto.Product;
import com.falabella.restfulapi.idao.IStore;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jorge
 */
@RestController
public class Store {

    private final IStore store;
    private final ProductModelAssembler assembler;
    
    Store(IStore store, ProductModelAssembler assembler) {
        this.store = store;
        this.assembler = assembler;
    }

    @PostMapping("/products")
    ResponseEntity<?> storeProduct(@RequestBody Product newProduct) {
        EntityModel<Product> entityModel = assembler.toModel(store.save(newProduct));
        
        return ResponseEntity
            .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
            .body(entityModel);
    }
}
