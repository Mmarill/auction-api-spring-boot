package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
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
<<<<<<< HEAD
// under const
/*    @DeleteMapping("/delete/{id}")
    public String deleteAuction(@RequestParam String id) {
         auctionService.delete(id);
        return "Well done";
    }*/
=======

    @GetMapping("/{auctionId}")
    public Optional<Auction> getBidById(@PathVariable String bidId){
        return auctionService.findById(bidId);
    }



>>>>>>> main
}
