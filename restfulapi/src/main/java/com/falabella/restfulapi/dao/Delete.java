/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dao;

import com.falabella.restfulapi.idao.IDelete;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jorge
 */
@RestController
public class Delete {

    private final IDelete delete;

    Delete(IDelete delete) {
        this.delete = delete;
    }

    @DeleteMapping("/products/{productId}")
    ResponseEntity<?> deleteProduct(@PathVariable Integer productId) {
        delete.deleteById(productId);
        return ResponseEntity.noContent().build();
    }
}
