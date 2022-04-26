package com.example.auctionapispring.auctions;

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

    public List<Auction> deleteAuction (String id) {return auctionRepository.deleteAuction(id);}
    
    public Optional<Auction> findById(String id) {return auctionRepository.findById(id);}


    }

