package com.example.healtfood.reposiotory;

import com.example.healtfood.entity.Cart;
import com.example.healtfood.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CartRepositoryTest {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;

    @Test
//    @Transactional
//    @Rollback(value = false)
    void test() {
        //given
        Set<Product> products = new HashSet<>(Arrays.asList(
                new Product("white", BigDecimal.valueOf(34)),
                new Product("blue", BigDecimal.valueOf(32))));
        productRepository.saveAll(products);
        Cart cart = new Cart();
        cart.setProducts(products);


        //when
        Cart savedCart = cartRepository.save(cart);
        //then
        assertAll(
                ()-> assertNotNull(savedCart,"savedCart is null")
        );
    }

}