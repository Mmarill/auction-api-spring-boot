package com.example.auctionapispring.auctions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface AuctionRepository extends MongoRepository<Auction, String> {
    Optional <Auction> findById(String id);

    List<Auction> deleteAuction(String id);


}
