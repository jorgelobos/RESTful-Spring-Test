/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.falabella.restfulapi.idao;

import com.falabella.restfulapi.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jorge
 */
public interface IDelete extends JpaRepository<Product, Integer> {

}
