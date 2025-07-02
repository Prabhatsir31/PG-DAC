package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken,String> 
{
	Optional<RefreshToken> findByRefreshToken(String token);
}
