package com.example.healtfood.web.controller;

import com.example.healtfood.entity.Product;
import com.example.healtfood.service.ProductService;
import com.example.healtfood.service.mapper.ProductMapper;
import com.example.healtfood.web.model.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/clothes")
public class ProductController {


    private static final Logger LOGGER = Logger.getLogger(ProductController.class.getName());

    //    private final ClothesReposiotry clothesReposiotry;
    private final ProductMapper productMapper;
    private final ProductService productService;



    public ProductController(ProductMapper productMapper, ProductService productService) {
        this.productMapper = productMapper;
        this.productService = productService;
    }


    @GetMapping
    public String list( Model model) {
        LOGGER.info("list()");

        List<Product> products = productService.list();
        LOGGER.info(products + "");
        model.addAttribute("clothes", products);
        return "clothes";
    }

    @GetMapping("/create")
    public String createView() {
        LOGGER.info("createView()");
        return "add-clothe";
    }

    @PostMapping
//    public String create(@RequestParam String color, @RequestParam String size) {
    public String create(ProductDto productDto) {
        LOGGER.info("crete()");
        productService.create(productDto);
        return "redirect:clothes";
    }
}
// Cart
// - List<Product>
// Product
// - String name;
// - BigDecimal price;
// - Category category;
// Category
// - Long id;
// -String name;
// Order
// - List<Product> products;
// - BigDecimal totalPrice;
// - Shipment shipment;
// Shipment
// - Address address;
// - CourierType courierType;
// - Client client;
// Address
// - String city;
// - String street;
// - String number;
// - String postCode;
// - String country;
