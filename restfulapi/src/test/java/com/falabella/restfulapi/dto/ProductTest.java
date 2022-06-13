/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.falabella.restfulapi.dto;

import java.net.URL;
import java.util.Collection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jorge
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Product.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Product instance = new Product();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSKU method, of class Product.
     */
    @Test
    public void testGetSKU() {
        System.out.println("getSKU");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getSKU();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Product.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class Product.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Product.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Product instance = new Product();
        String expResult = "";
        String result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        Double expResult = null;
        Double result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrincipalImage method, of class Product.
     */
    @Test
    public void testGetPrincipalImage() {
        System.out.println("getPrincipalImage");
        Product instance = new Product();
        URL expResult = null;
        URL result = instance.getPrincipalImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOtherImages method, of class Product.
     */
    @Test
    public void testGetOtherImages() {
        System.out.println("getOtherImages");
        Product instance = new Product();
        Collection<URL> expResult = null;
        Collection<URL> result = instance.getOtherImages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Product.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Product instance = new Product();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Product.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Product instance = new Product();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrand method, of class Product.
     */
    @Test
    public void testSetBrand() {
        System.out.println("setBrand");
        String brand = "";
        Product instance = new Product();
        instance.setBrand(brand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Product.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        String size = "";
        Product instance = new Product();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double price = null;
        Product instance = new Product();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrincipalImage method, of class Product.
     */
    @Test
    public void testSetPrincipalImage() {
        System.out.println("setPrincipalImage");
        URL principalImage = null;
        Product instance = new Product();
        instance.setPrincipalImage(principalImage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOtherImages method, of class Product.
     */
    @Test
    public void testSetOtherImages() {
        System.out.println("setOtherImages");
        Collection<URL> otherImages = null;
        Product instance = new Product();
        instance.setOtherImages(otherImages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Product.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Product instance = new Product();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Product.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
