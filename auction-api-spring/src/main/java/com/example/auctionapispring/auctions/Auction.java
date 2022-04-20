package com.example.auctionapispring.auctions;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Document(collection="auction")
public class Auction {
    private String id;
    private String auctionId;
    private String productName;
    private String productInfo;
    private String productImgURL;
    private int startPrice;
    private String endPrice;
    private LocalTime startTime;

    public Auction() {
    }

    public Auction(String id, String auctionId, String productName, String productInfo,
                   String productImgURL, int startPrice, String endPrice, LocalTime startTime) {
        this.id = id;
        this.auctionId = auctionId;
        this.productName = productName;
        this.productInfo = productInfo;
        this.productImgURL = productImgURL;
        this.startPrice = startPrice;
        this.endPrice = endPrice;
        this.startTime = startTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
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

    public int getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public String getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
}
