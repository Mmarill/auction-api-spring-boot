package com.example.auctionapispring.files;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class File {

    @Id
    private String id;
    private String fileName;

    public File() {
    }

    public File(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public String getPhotos() {
        return fileName;
    }

    public void setPhotos(String photos) {
        this.fileName = photos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}