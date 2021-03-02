package com.example.healtfood.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/carts")
public class CartController {

    @GetMapping
    public String list( )  {

        return "carts";
    }

}
