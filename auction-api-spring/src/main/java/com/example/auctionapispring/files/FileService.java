package com.example.auctionapispring.files;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FileService {

    @Autowired
    FileRepository fileRepository;

    public File save(File uploadImage){
        return fileRepository.save(uploadImage);
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
