package com.example.auctionapispring.users;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String email);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);
}
