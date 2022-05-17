package com.example.auctionapispring.files;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class File {

    @Id
    private String id;
    private Binary image;
    private String auctionId;

    public File() {
    }

    public File(String id, Binary image, String auctionId) {
        this.id = id;
        this.image = image;
        this.auctionId = auctionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Binary getImage() {
        return image;
    }

    public void setImage(Binary image) {
        this.image = image;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", image=" + image +
                ", auctionId='" + auctionId + '\'' +
                '}';
    }
}