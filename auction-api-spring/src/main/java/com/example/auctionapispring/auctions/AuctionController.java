package com.example.auctionapispring.auctions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auction")
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
// under const
/*    @DeleteMapping("/delete/{id}")
    public String deleteAuction(@RequestParam String id) {
         auctionService.delete(id);
        return "Well done";
    }*/
}
