package com.example.auctionapispring.bids;

import com.example.auctionapispring.auctions.Auction;
import com.example.auctionapispring.auctions.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/bids")
@CrossOrigin
public class BidsController {

    @Autowired
    BidsService bidsService;

    @Autowired
    AuctionService auctionService;

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
        return bidsService.getUserBids(userId);
    }

    // Gets all bids belonging to a specific auction
    @GetMapping("/auction/{auctionId}")
    public List<Bid> getBidsAuctionId(@PathVariable("auctionId") String auctionId){
        return bidsService.getAuctionBids(auctionId);
    }

    // Create a new bid and save it to database
    @PostMapping("/create")
    public Bid createBid(@RequestBody Bid bid){
        bid.setBidTime(LocalDateTime.now());
        return bidsService.createBid(bid);
    }

}
