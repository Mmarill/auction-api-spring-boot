package com.example.auctionapispring.bids;

import com.example.auctionapispring.auctions.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface BidsRepository extends MongoRepository <Bid, String>{
    //Optional<Bid> findById(String id);

}

