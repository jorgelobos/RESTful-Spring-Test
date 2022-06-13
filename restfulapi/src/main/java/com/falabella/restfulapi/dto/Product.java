/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.falabella.restfulapi.dto;

import java.util.Objects;
import java.net.URL;
import java.util.Collection;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Size(min = 1000000, max = 99999999)
    private Integer Id;
    
    @NotNull
    @Size(min = 3, max = 50)
    private String Name;
    
    @NotNull
    @Size(min = 3, max = 50)
    private String Brand;
    
    @NotNull
    private String ProductSize;
    
    @NotNull
    @Size(min = 1, max = 99999999)
    private Double Price;
    
    
    private URL PrincipalImage;
    
    @ElementCollection
    @CollectionTable(name="OTHER_IMAGES")
    private Collection<URL> OtherImages;

    Product() {
    }

    public Product(Integer id, String name, String brand, String size, Double price, URL principalImage, Collection<URL> otherImages) {
        this.Id = id;
        this.Name = name;
        this.Brand = brand;
        this.ProductSize = size;
        this.Price = price;
        this.PrincipalImage = principalImage;
        this.OtherImages = otherImages;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getSKU() {
        return "FAL-" + this.Id;
    }

    public String getName() {
        return this.Name;
    }

    public String getBrand() {
        return this.Brand;
    }

    public String getSize() {
        return this.ProductSize;
    }

    public Double getPrice() {
        return this.Price;
    }

    public URL getPrincipalImage() {
        return this.PrincipalImage;
    }

    public Collection<URL> getOtherImages() {
        return this.OtherImages;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public void setSize(String size) {
        this.ProductSize = size;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public void setPrincipalImage(URL principalImage) {
        this.PrincipalImage = principalImage;
    }

    public void setOtherImages(Collection<URL> otherImages) {
        this.OtherImages = otherImages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;
        Boolean check = Objects.equals(this.Id, product.Id)
                && Objects.equals(this.Name, product.Name);
        return check;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.Id);
        hash = 37 * hash + Objects.hashCode(this.Name);
        return hash;
    }
}
