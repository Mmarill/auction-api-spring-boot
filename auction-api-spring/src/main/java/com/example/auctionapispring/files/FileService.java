package com.example.auctionapispring.files;


import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class FileService {

    @Autowired
    FileRepository fileRepository;


    public String addPhoto(MultipartFile file) throws IOException{
        File photo = new File();
        photo.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
                photo = fileRepository.insert(photo); return photo.getId();
    }
    public List<File> loadAll(){
        return fileRepository.findAll();
    }

    public File getImageById(String id){
        return fileRepository.findById(id).get();
    }

    public String deleteImageById(String id){
        fileRepository.deleteById(id);
        return "Image has been deleted";
    }


}
