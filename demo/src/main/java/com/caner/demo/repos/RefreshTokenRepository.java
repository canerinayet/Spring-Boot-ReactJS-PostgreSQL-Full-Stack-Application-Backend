package com.caner.demo.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.caner.demo.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

    RefreshToken findByUserId(Long userId);

}