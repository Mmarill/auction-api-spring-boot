package com.example.auctionapispring.bids;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidsService {

    @Autowired
    BidsRepository bidsRepository;

}
