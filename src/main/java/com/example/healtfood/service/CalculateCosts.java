package com.example.healtfood.service;

import com.example.healtfood.entity.Product;
import com.example.healtfood.entity.User;

import java.math.BigDecimal;
import java.util.List;

public class CalculateCosts {
    private User user;

    public CalculateCosts() {
    }

    public CalculateCosts(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public BigDecimal calculateCosts(){
        List<Product> productList = user.getClotheList();
        BigDecimal finalPrice = new BigDecimal(0);
        for (int i = 0; i < productList.size(); i++) {

            finalPrice.add(productList.get(i).getPrice());
        }
        switch (user.getUserType()){
            case NORMAL:
                finalPrice = finalPrice.multiply(BigDecimal.valueOf(1));
                break;

            case SILVER:
                finalPrice = finalPrice.multiply(BigDecimal.valueOf(0.9));
                break;
            case GOLD:
                finalPrice = finalPrice.multiply(BigDecimal.valueOf(0.8));
                break;
            case PREMIUM:
                finalPrice = finalPrice.multiply((BigDecimal.valueOf(0.7)));
        }
        return finalPrice;
    }
}
