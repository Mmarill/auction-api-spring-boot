package com.example.auctionapispring.bids;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BidsRepository extends MongoRepository <Bid, String>{
    Optional<Bid> findById(String bidId);

    // Gets all bids belonging to a specific user
    @Query(value = "{'userId':?0}")
    List<Bid> findByUserId(String userId);

    // Gets all bids belonging to a specific auction
    @Query(value = "{'auctionId':'?0'}")
    List<Bid> findByAuctionId(String auctionId);


}
