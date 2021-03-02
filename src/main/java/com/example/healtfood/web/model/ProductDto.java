package com.example.healtfood.web.model;

import com.example.healtfood.entity.User;
import com.example.healtfood.enums.Ratings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String color;
    private BigDecimal price;
    private Ratings ratings;
    private String size;
    private User user;

    public ProductDto() {
    }

    public ProductDto(Long id, String color, BigDecimal price, Ratings ratings, String size, User user) {
        this.id = id;
        this.color = color;
        this.price = price;
        this.ratings = ratings;
        this.size = size;
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ClotheDto{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", ratings=" + ratings +
                ", size='" + size + '\'' +
                ", user=" + user +
                '}';
    }
}
