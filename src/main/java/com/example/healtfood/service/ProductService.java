package com.example.healtfood.service;

import com.example.healtfood.entity.Product;
import com.example.healtfood.reposiotory.ProductRepository;
import com.example.healtfood.service.mapper.ProductMapper;
import com.example.healtfood.web.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ProductService {
    private static final Logger LOGGER = Logger.getLogger(ProductService.class.getName());

    private ProductMapper productMapper;
    private ProductRepository productRepository;

    public ProductService(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public List<Product> list() {
        LOGGER.info("list()");
        List<Product> products = productRepository.findAll();
        LOGGER.info("list()=" + products);
        return products;
    }

    public ProductDto create(ProductDto productDto) {
        LOGGER.info("create( " + productDto + " )");
        Product product = productMapper.from(productDto);


        Product savedProduct = productRepository.save(product);
        LOGGER.info(" " + savedProduct + " ");
        ProductDto saveProductDto = productMapper.from(savedProduct);

        return saveProductDto;
    }

}
