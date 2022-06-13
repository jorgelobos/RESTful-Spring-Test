/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dao;

import com.falabella.restfulapi.dto.Product;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
/**
 *
 * @author jorge
 */
@Component
class ProductModelAssembler implements RepresentationModelAssembler<Product, EntityModel<Product>> {

  @Override
  public EntityModel<Product> toModel(Product product) {

    return EntityModel.of(product,
        linkTo(methodOn(Retrieve.class).retrieveProduct(product.getId())).withSelfRel(),
        linkTo(methodOn(Retrieve.class).listProducts()).withRel("products"));
  }
}
