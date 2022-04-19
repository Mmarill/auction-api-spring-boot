package com.example.auctionapispring.bids;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BidsRepository extends MongoRepository {
    Optional<Bid> findById(String id);
}

