package com.example.auctionapispring.files;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="images")
public class File {

    @Id
    private String id;
    private String fileUrl;

    public File(String id, String photos) {
        this.id = id;
        this.fileUrl = photos;
    }

    public String getPhotos() {
        return fileUrl;
    }

    public void setPhotos(String photos) {
        this.fileUrl = photos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
