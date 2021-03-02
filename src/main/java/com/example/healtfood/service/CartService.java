package com.example.healtfood.service;

import com.example.healtfood.entity.Cart;
import com.example.healtfood.reposiotory.CartRepository;
import com.example.healtfood.service.mapper.CartMapper;
import com.example.healtfood.web.model.CartDto;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CartService {
    private static final Logger LOGGER = Logger.getLogger(ProductService.class.getName());

    private final CartRepository cartRepository;

    private final CartMapper cartMapper;

    public CartService(CartRepository cartRepository, CartMapper cartMapper) {
        this.cartRepository = cartRepository;
        this.cartMapper = cartMapper;
    }
    public CartDto create(CartDto cartDto){
        LOGGER.info("create(" + cartDto + ")");

        Cart cart = cartMapper.from(cartDto);
        Cart save = cartRepository.save(cart);
        CartDto savedCart = cartMapper.from(save);
        LOGGER.info("create()=" +  savedCart);

        return savedCart;

    }
}
