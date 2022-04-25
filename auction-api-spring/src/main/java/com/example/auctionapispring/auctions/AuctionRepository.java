package com.example.auctionapispring.auctions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends MongoRepository<Auction, String> {
    // under const
  //  void deleteById(String id);
}
