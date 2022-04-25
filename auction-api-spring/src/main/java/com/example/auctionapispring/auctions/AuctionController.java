package com.example.auctionapispring.auctions;

import com.example.auctionapispring.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auction")
public class AuctionController {
    @Autowired
    AuctionService auctionService;
    @Autowired
    AuctionRepository auctionRepository;

    @PostMapping("/create")
    public Auction createAuction(@RequestBody Auction auction){
        return auctionService.createAuction(auction);
    }

    @GetMapping("/all")
    public List<Auction> getAuctions(){
        return auctionService.getAuctions();
    }

    @DeleteMapping("/delete/{id}")
    public List <Auction> deleteAuction(@RequestParam String id){
        return auctionService.deleteAuction(id);
    }
    
}
