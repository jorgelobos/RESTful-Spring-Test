/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.helpers.exceptions;

/**
 *
 * @author jorge
 */
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Integer id) {
        super("Could not find product FAL-" + id);
    }
}
