package com.example.auctionapispring.users;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);

    Boolean existsByEmail(String email);
}
