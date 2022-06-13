/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dao;

import com.falabella.restfulapi.dto.Product;
import com.falabella.restfulapi.helpers.exceptions.ProductNotFoundException;
import com.falabella.restfulapi.idao.IRetrieve;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jorge
 */
@RestController
public class Retrieve {

    private final IRetrieve retrieve;
    private final ProductModelAssembler assembler;
    
    Retrieve(IRetrieve retrieve, ProductModelAssembler assembler) {
        this.retrieve = retrieve;
        this.assembler = assembler;
    }

    @GetMapping("/products")
    public CollectionModel<EntityModel<Product>> listProducts() {
        List<EntityModel<Product>> products = retrieve.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

        return CollectionModel.of(products, linkTo(methodOn(Retrieve.class).listProducts()).withSelfRel());
    }

    @GetMapping("/products/{productId}")
    public EntityModel<Product> retrieveProduct(@PathVariable Integer productId) {
        Product product = retrieve.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));

        return assembler.toModel(product);
    }
}
