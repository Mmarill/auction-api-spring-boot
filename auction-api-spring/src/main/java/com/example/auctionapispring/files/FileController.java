package com.example.auctionapispring.files;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/images")
public class FileController {

    @Autowired
    FileService fileService;

    @RequestMapping(method = RequestMethod.POST, value = "/upload")
    public String addPhoto(@RequestParam("title") String title,
                           @RequestParam("productImgURL") MultipartFile image, Model model)
            throws IOException {
        String id = fileService.addPhoto(title, image);
        System.out.println(id.getClass().getSimpleName());
        return "redirect:/photos/" + id;
    }

    // Get all images
    @GetMapping("/all")
    public List<File> getListFiles() {
        return  fileService.loadAll();
    }

    @GetMapping("/image/{id}")
    @ResponseBody
    public ResponseEntity<byte[]> getImage(@PathVariable String id) throws IOException{
        File imageFile = fileService.getImageById(id);
        System.out.println(imageFile);
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageFile.getImage().getData());
    }

    @DeleteMapping("/delete/{id}")
    public String deleteImage(@PathVariable String id){
        return fileService.deleteImageById(id);
    }
}


//    @GetMapping("/{id}")
//    @ResponseBody
//    public File getImageByID(@PathVariable String id) {
//        return fileService.getImageById(id);
//    }
