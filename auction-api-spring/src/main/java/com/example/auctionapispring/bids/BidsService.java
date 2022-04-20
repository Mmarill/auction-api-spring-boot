package com.example.auctionapispring.bids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BidsService {

    @Autowired
    BidsRepository bidsRepository;

    // Gets all bids in db
    public List<Bid> getAllBids(){
        return bidsRepository.findAll();
    }

    // // Gets a specific bid by its id
    public Optional<Bid> findById(String bidId){
        return bidsRepository.findById(bidId);
    }

    // Gets all bids belonging to a specific user
    public List<Bid> getUserBids(String userId){
        List<Bid> bids = bidsRepository.findByUserId(userId);
        return bids;
    }

    // Gets all bids belonging to a specific auction
    public List<Bid> getAuctionBids(String auctionId){
        List<Bid> bids = bidsRepository.findByAuctionId(auctionId);
        return bids;
    }

    // Create a new bid and save it to database
    public Bid createBid(Bid bid) {
        return bidsRepository.insert(bid);
    }

}
