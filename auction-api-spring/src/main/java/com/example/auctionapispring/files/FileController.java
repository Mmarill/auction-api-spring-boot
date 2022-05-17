package com.example.auctionapispring.files;


import com.example.auctionapispring.auctions.Auction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/images")
public class FileController {

    @Autowired
    FileService fileService;

    // Upload image
    @PostMapping(value="/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String addPhoto(@RequestParam("file") MultipartFile image, Model model)
            throws IOException {
        String id = fileService.addPhoto(image);
        return id;
    }

    // Get all images
    @GetMapping("/all")
    public List<File> getListFiles() {
        return  fileService.loadAll();
    }

    //Get image by id
    @GetMapping("/image/{id}")
    @ResponseBody
    public ResponseEntity<byte[]> getImage(@PathVariable String id) throws IOException{
        File imageFile = fileService.getImageById(id);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageFile.getImage().getData());
    }

    // Delete image by id
    @DeleteMapping("/delete/{id}")
    public String deleteImage(@PathVariable String id){
        return fileService.deleteImageById(id);
    }
}
