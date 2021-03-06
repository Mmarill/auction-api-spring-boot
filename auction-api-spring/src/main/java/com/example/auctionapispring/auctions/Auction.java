package com.example.auctionapispring.auctions;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection="auctions")
public class Auction {

    @Id
    private String id;
    private String userId;
    private String productName;
    private String productInfo;
    private String productImgURL;
    private int startPrice;
    private int endPrice;
    private LocalDateTime endTime;

    public Auction() {
    }

    public Auction(String id, String userId,String productName, String productInfo,
                   String productImgURL, int startPrice, int endPrice, LocalDateTime endTime) {

        this.id = id;
        this.userId = userId;
        this.productName = productName;
        this.productInfo = productInfo;
        this.productImgURL = productImgURL;
        this.startPrice = startPrice;
        this.endPrice = endPrice;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


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

    public int getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(int startPrice) {
        this.startPrice = startPrice;
    }

    public int getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(int endPrice) {
        this.endPrice = endPrice;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", productName='" + productName + '\'' +
                ", productInfo='" + productInfo + '\'' +
                ", productImgURL='" + productImgURL + '\'' +
                ", startPrice=" + startPrice +
                ", endPrice=" + endPrice +
                ", endTime=" + endTime +
                '}';
    }
}
