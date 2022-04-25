package com.example.auctionapispring.auctions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
