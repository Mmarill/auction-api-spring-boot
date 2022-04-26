package com.example.auctionapispring.files;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="images")
public class File {

    @Id
    private String id;
    private String title;
    private Binary image;


    public File() {
    }

    public File(String id, String title, Binary image) {
        this.id = id;
        this.title = title;
        this.image = image;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", image=" + image +
                '}';
    }
}