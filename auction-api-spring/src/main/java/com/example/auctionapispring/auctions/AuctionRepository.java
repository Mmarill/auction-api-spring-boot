package com.example.auctionapispring.auctions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuctionRepository extends MongoRepository<Auction, String> {
    Optional<Auction> findById(String id);
    @Query(value = "{'userId':?0}")
    Optional<Auction> findByUserId(String userId);
}
