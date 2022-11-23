package com.projects.aquarium.repository;

import com.projects.aquarium.entity.AuthenticationToken;
import com.projects.aquarium.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {
    AuthenticationToken findTokenByUser(User user);
    AuthenticationToken findTokenByToken(String token);

    AuthenticationToken findUserByToken(String token);
}
