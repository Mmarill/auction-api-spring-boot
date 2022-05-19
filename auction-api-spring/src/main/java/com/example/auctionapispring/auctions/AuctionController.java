package com.example.auctionapispring.auctions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auction")
public class AuctionController {

    @Autowired
    AuctionService auctionService;

    @PostMapping(value="/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Auction createAuction(@RequestPart("file") MultipartFile image, @RequestPart("auction") Auction auction) throws IOException {
        auction.setEndTime(LocalDateTime.now().plusDays(5));
        auction.setProductImgURL(auctionService.addPhoto(image));
        return auctionService.createAuction(auction);
    }

    @GetMapping("/all")
    public List<Auction> getAuctions() {
        return auctionService.getAuctions();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuction(@PathVariable String id) {
        return auctionService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Auction> getAuctionById(@PathVariable String id) {
        return auctionService.findById(id);
    }

    @GetMapping("/user/{userId}")
    public Optional<Auction> getAuctionByUserId(@PathVariable("userId") String userId) {
        return auctionService.findByUserId(userId);
    }
}