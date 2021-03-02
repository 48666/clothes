package com.example.healtfood.service.mapper;

import com.example.healtfood.entity.Product;
import com.example.healtfood.web.model.ProductDto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductMapperTest {

    public static final String CLOTHE_COLOR_BLUE = "blue";

    @Test
    void from() {
        //given
        ProductMapper productMapper = new ProductMapper();
        ProductDto productDto = new ProductDto();
        productDto.setColor("white");
        productDto.setPrice(new BigDecimal(34));
        productDto.setSize("xxl");

        //when
        Product product = productMapper.from(productDto);

        //then
        assertAll(
                () -> assertNotNull(product, "clothe is null"),
                () -> assertEquals(productDto.getColor(), product.getColor(), "clohte color are not equal")
        );
    }
    @Test
    void from1(){
        //given
        ProductMapper productMapper = new ProductMapper();
        Product product = new Product();
        product.setSize("xxl");
        product.setPrice(BigDecimal.valueOf(59));
        product.setColor(CLOTHE_COLOR_BLUE);


                //when
        ProductDto productDto = productMapper.from(product);
        //then
        assertAll(
                () -> assertNotNull(productDto, "clothe is null"),
                () -> assertEquals(CLOTHE_COLOR_BLUE, productDto.getColor(), "clohte color are not equal")

        );
    }
}