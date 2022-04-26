package com.example.auctionapispring.auctions;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auction")
public class AuctionController {

    @Autowired
    AuctionService auctionService;


    @PostMapping("/create")
    public Auction createAuction(@RequestBody Auction auction) {
        return auctionService.createAuction(auction);
    }

    @GetMapping("/all")
    public List<Auction> getAuctions() {
        return auctionService.getAuctions();
    }

<<<<<<< HEAD
    @DeleteMapping("/delete")
    public List<Auction> deleteAuction (@RequestParam String id){
        return auctionService.deleteAuction(id);
    }

    @GetMapping("/ById/{id}")
    public Optional<Auction> findById (@RequestParam String id){
        return auctionService.findById(id);
    }


}
=======

    @DeleteMapping("/delete/{id}")
    public String deleteAuction(@PathVariable String id) {
        return auctionService.deleteById(id);
    }


    @GetMapping("/{id}")
    public Optional<Auction> getAuctionById(@PathVariable String id){
        return auctionService.findById(id);
    }

    @GetMapping("/user/{userId}")
    public Optional<Auction> getAuctionByUserId(@PathVariable("userId") String userId){
        return auctionService.findByUserId(userId);
    }
}
>>>>>>> main
