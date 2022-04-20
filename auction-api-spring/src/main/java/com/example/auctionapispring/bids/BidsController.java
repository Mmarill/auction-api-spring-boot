package com.example.auctionapispring.bids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/bids")
public class BidsController {

    @Autowired
    BidsService bidsService;

    // Gets all bids in database (For test cases only)
    @GetMapping("/all")
    public List<Bid> getAllBids() {
        return bidsService.getAllBids();
    }

    // Gets a specific bid by its id
    @GetMapping("/{bidId}")
    public Optional<Bid> getBidById(@PathVariable String bidId){
        return bidsService.findById(bidId);
    }

    // Gets all bids belonging to a specific user
    @GetMapping("/user/{userId}")
    public List<Bid> getBidsUserId(@PathVariable("userId") String userId){
        System.out.println("BidsController out <userId>: " + userId);
        return bidsService.getUserBids(userId);
    }

    // Gets all bids belonging to a specific auction
    @GetMapping("/auction/{auctionId}")
    public List<Bid> getBidsAuctionId(@PathVariable("auctionId") String auctionId){
        System.out.println("BidsController out <auctionId>: " + auctionId);
        return bidsService.getAuctionBids(auctionId);
    }

    // Create a new bid and save it to database
    @PostMapping("/create")
    public Bid createBid(@RequestBody Bid bid){
        return bidsService.createBid(bid);
    }


}
