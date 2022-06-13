package com.falabella.restfulapi;

import com.falabella.restfulapi.dto.Product;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {

    EntityManager entityManager;
    
    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
    }
    
    @Test
//    @Transactional
    public void insertShoe() throws MalformedURLException {
        URL principal = new URL("https://falabella.scene7.com/is/image/Falabella/8406270_1");
        List<URL> other = Collections.emptyList();
        Product product = new Product(
                8406270,
                "500 Zapatilla Urbana Mujer",
                "New Balance",
                "37",
                42990.00,
                principal,
                other
        );

        entityManager.persist(product);
        assertNotNull(product.getId());
    }
    
    @Test
    public void insertBike() throws MalformedURLException {
        URL principal = new URL("https://falabella.scene7.com/is/image/Falabella/881952283_1");
        List<URL> other = new ArrayList<>();
        other.add(new URL("https://falabella.scene7.com/is/image/Falabella/881952283_2"));
        Product product = new Product(
                881952283,
                "Bicicleta Baltoro Aro 29",
                "Jeep",
                "ST",
                399990.00,
                principal,
                other
        );

        entityManager.persist(product);
        assertNotNull(product.getId());
    }
    
    @Test
    @Transactional
    public void updateBikeToShirt() throws MalformedURLException {
        Product product = entityManager.find(Product.class,881952283);
        product.setName("Camisa Manga Corta Hombre");
        product.setBrand("Basement");
        product.setSize("M");
        product.setPrice(24990.0);
        product.setPrincipalImage(new URL("https://falabella.scene7.com/is/image/Falabella/881898502_1"));
        product.setOtherImages(Collections.emptyList());
        entityManager.merge(product);

        Product productUpdated = entityManager.find(Product.class,8406270);
        assertEquals("test", productUpdated.getName());
    }

    @Test
    public void findById() {
        Product product = entityManager.find(Product.class, 8406270);
        assertEquals(8406270, product.getId());
    }
}
