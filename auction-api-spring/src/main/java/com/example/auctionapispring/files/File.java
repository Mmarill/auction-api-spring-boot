package com.example.auctionapispring.files;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class File {

    private Binary image;


    public File() {
    }

    public File(Binary image, String auctionId) {

        this.image = image;

    }


    public Binary getImage() {
        return image;
    }

    public void setImage(Binary image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return "File{" +

                ", image=" + image +

                '}';
    }
}