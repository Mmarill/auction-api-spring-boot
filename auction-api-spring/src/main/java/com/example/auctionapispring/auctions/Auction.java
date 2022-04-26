package com.example.auctionapispring.auctions;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Document(collection="auctions")
public class Auction {
    private String id;
    private int auctionId;
    private int userId;
    private String productName;
    private String productInfo;
    private String productImgURL;
    private Long startPrice;
    private String endPrice;
    private Date endTime;
    private List<?> bids;

    public Auction() {
    }

    public Auction(String id, int auctionId, int userId,String productName, String productInfo,
                   String productImgURL, Long startPrice, String endPrice, Date endTime, List<?> bids) {
        this.id = id;
        this.auctionId = auctionId;
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

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<?> getBids() {
        return bids;
    }

    public void setBids(List<?> bids) {
        this.bids = bids;
    }
}
