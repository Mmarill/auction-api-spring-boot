package com.example.auctionapispring.files;


import com.example.auctionapispring.payload.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/api/images")
public class FileController {

    @Autowired
    FileService fileService;


    // Upload images, if successfully ok response and message, if not error response + message
    @PostMapping("/upload")
    public ResponseEntity<MessageResponse> handleImageUpload(@RequestParam(value="productImgURL") MultipartFile image){
        // vi behöver lägga till enctype="multipart/form-data i vår form där man laddar upp img. Detta för att förklara vad det är för objekt.
        String message = "";

        /*
         if(file.isEmpty())
            message = "please select a picture";
            return ResponseEntity.ok().body(new MessageResponse(message));
        */
        try {

            /*
             * The class StringUtils come from the package org.springframework.util.
             *  Note that we store only the file name in the database table, and the actual uploaded file is stored in the file system:
             * Går nog att använda image direkt istälelt för att spara namnet -->
             * Hur gör man då? Kan det vara så att man måste skapa MultipartFile i File, fileSerivice.
             * */
            String fileName = StringUtils.cleanPath(Objects.requireNonNull(image.getOriginalFilename())); // denna sparar alltså bara namnet på filen.
            File uploadFile = new File(); // creating a new object
            uploadFile.setPhotos(fileName); //store filename into Entity "file".
            fileService.save(uploadFile); // save entity to db
            message = "Uploaded the file successfully: " + fileName;
            return ResponseEntity.ok().body(new MessageResponse(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + image.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message));
        }
    }

    // Get all images
    @GetMapping("/all")
    public List<File> getListFiles() {
        return  fileService.loadAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public File getImageByID(@PathVariable String id) {
        return fileService.getImageById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteImage(@PathVariable String id){
        return fileService.deleteImageById(id);
    }
}
