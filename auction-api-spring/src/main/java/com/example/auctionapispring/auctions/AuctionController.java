package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auction")
@CrossOrigin
public class AuctionController {

    @Autowired
    AuctionService auctionService;

    @PostMapping("/create")
    public Auction createAuction(@RequestBody Auction auction){
        return auctionService.createAuction(auction);
    }

    @GetMapping("/all")
    public List<Auction> getAuctions(){
        return auctionService.getAuctions();
    }

    @GetMapping("/{auctionId}")
    public Optional<Auction> getBidById(@PathVariable String bidId){
        return auctionService.findById(bidId);
    }
    


}
