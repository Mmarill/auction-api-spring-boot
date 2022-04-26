package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD

import java.util.List;
=======
>>>>>>> main
import java.util.Optional;

@Repository
public interface AuctionRepository extends MongoRepository<Auction, String> {
<<<<<<< HEAD
    Optional <Auction> findById(String id);

    List<Auction> deleteAuction(String id);

=======
    Optional<Auction> findById(String id);

    @Query(value = "{'userId':?0}")
    Optional<Auction> findByUserId(String userId);
>>>>>>> main

}
