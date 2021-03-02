package com.example.healtfood.reposiotory;

import com.example.healtfood.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiotry extends JpaRepository<User,Long> {
}
