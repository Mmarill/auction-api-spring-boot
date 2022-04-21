package com.example.auctionapispring.bids;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="bids")
public class Bid {

    @Id
    private String id;  // Ska databas skapa eller ska vi använda typ UUID eller nåt?
    private Date bidTime;
    private String userId;
    private String auctionId;
    private double amount;

    public Bid(String id, Date bidTime, String userId, String auctionId, double amount) {
        this.id = id;
        this.bidTime = bidTime;
        this.userId = userId;
        this.auctionId = auctionId;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id='" + id + '\'' +
                ", bidTime=" + bidTime +
                ", userId='" + userId + '\'' +
                ", auctionId='" + auctionId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
