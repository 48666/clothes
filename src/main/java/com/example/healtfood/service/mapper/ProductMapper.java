package com.example.healtfood.service.mapper;

import com.example.healtfood.entity.Product;
import com.example.healtfood.web.model.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ProductMapper {
    private static final Logger LOGGER= Logger.getLogger(ProductMapper.class.getName());

    public Product from(ProductDto productDto){
        LOGGER.info("from(" + productDto + ")");
        ModelMapper modelMapper = new ModelMapper();
        Product product = modelMapper.map(productDto, Product.class);
        LOGGER.info("from(...) = " + product);
        return product;
    }
    public ProductDto from(Product product){
        LOGGER.info("from(" + product + ")");

//        ClotheDto dto = new ClotheDto();
        ModelMapper modelMapper = new ModelMapper();
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        LOGGER.info("from(...)=" + productDto);
        return productDto;
    }
}
