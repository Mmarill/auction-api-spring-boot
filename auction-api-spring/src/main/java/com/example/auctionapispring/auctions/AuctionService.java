package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
import com.example.auctionapispring.bids.BidsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionService {
    @Autowired
    AuctionRepository auctionRepository;
    @Autowired
    BidsRepository bidRepo;

    public Auction createAuction(Auction auction){
        return auctionRepository.save(auction);
    }

    public List<Auction> getAuctions() {
        return auctionRepository.findAll();
    }


    public String deleteById(String id) {

        auctionRepository.deleteById(id);

        return "Auction with id: " + id + " has been removed!";
    }

    public Optional<Auction> findById(String id){
        return auctionRepository.findById(id);
    }

    public Optional<Auction> findByUserId(String userId) {
        return auctionRepository.findByUserId(userId);
    }

}
