package com.example.healtfood.service.mapper;

import com.example.healtfood.entity.Cart;
import com.example.healtfood.web.model.CartDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class CartMapper {
    private static final Logger LOGGER= Logger.getLogger(CartMapper.class.getName());
    public CartDto from(Cart cart){
        LOGGER.info("from(" + cart +  ")");
        ModelMapper modelMapper = new ModelMapper();
        CartDto cartDto1 = modelMapper.map(cart, CartDto.class);

        return cartDto1;
    }
    public Cart  from(CartDto cartDto){
        LOGGER.info("from(" + cartDto +  ")");
        ModelMapper modelMapper = new ModelMapper();
        Cart cart = modelMapper.map(cartDto, Cart.class);

        return cart;
    }
}
