package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionService {
    @Autowired
    AuctionRepository auctionRepository;

    public Auction createAuction(Auction auction){
        return auctionRepository.save(auction);
    }

    public List<Auction> getAuctions() {
        return auctionRepository.findAll();
    }
<<<<<<< HEAD
    // under const
/*    public String delete(String id) {

        auctionRepository.deleteById(id);

        return "isRemoved";
    }*/
=======

    public Optional<Auction> findById(String auctionId){
        return auctionRepository.findById(auctionId);
    }
>>>>>>> main
}
