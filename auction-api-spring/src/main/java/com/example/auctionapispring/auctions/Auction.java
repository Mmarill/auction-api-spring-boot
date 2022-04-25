package com.example.auctionapispring.auctions;

import com.example.auctionapispring.bids.Bid;
<<<<<<< HEAD
import com.example.auctionapispring.users.User;
=======
import org.springframework.data.annotation.Id;
>>>>>>> main
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection="auctions")
public class Auction {
    private String id;
<<<<<<< HEAD
    private int auctionId;
=======
>>>>>>> main
    private String userId;
    private String productName;
    private String productInfo;
    private String productImgURL;
    private Long startPrice;
    private String endPrice;
<<<<<<< HEAD
    private Date endTime;
=======
    private LocalTime endTime;
>>>>>>> main
    private List<Bid> bids;

    public Auction() {
    }

<<<<<<< HEAD
    public Auction(String id, int auctionId, String userId, String productName, String productInfo,
                   String productImgURL, Long startPrice, String endPrice, Date endTime, List<Bid> bids) {


=======
    public Auction(String id, String userId,String productName, String productInfo,
                   String productImgURL, Long startPrice, String endPrice, LocalTime endTime, List<Bid> bids) {
>>>>>>> main
        this.id = id;
        this.userId = userId;
        this.productName = productName;
        this.productInfo = productInfo;
        this.productImgURL = productImgURL;
        this.startPrice = startPrice;
        this.endPrice = endPrice;
        this.endTime = endTime;
        this.bids = bids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


<<<<<<< HEAD
    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

=======
>>>>>>> main
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductImgURL() {
        return productImgURL;
    }

    public void setProductImgURL(String productImgURL) {
        this.productImgURL = productImgURL;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }
}
