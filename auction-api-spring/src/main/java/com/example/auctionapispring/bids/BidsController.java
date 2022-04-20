package com.example.auctionapispring.bids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/bid")
public class BidsController {

    @Autowired
    BidsService bidsService;

}
