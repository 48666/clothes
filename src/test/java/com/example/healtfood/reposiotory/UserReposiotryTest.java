package com.example.healtfood.reposiotory;

import com.example.healtfood.entity.User;
import com.example.healtfood.enums.EnumOperations;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserReposiotryTest {
    @Autowired
    private UserReposiotry userReposiotry;
        @Test
    void addUser(){
            //given

            User user = new User();
            user.setId(1L);
            user.setName("michał");
            user.setLastName("kowalski");
            user.setEmail("niewiem@gmail.com");
            user.setCountShopping(5);

            EnumOperations enumOperations = new EnumOperations(user,user.getCountShopping());
            enumOperations.setUserStatus();


            //when
           userReposiotry.save(user);
            List<User> all = userReposiotry.findAll();
            //then
            assertEquals(1,all.size());
        }
        @Test
    void findByID(){
User byId = userReposiotry.findById(1L).orElse(null);
            System.out.println(byId.toString());

        }

}