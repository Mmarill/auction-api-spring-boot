package com.example.auctionapispring.files;

import com.example.auctionapispring.payload.response.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*
 * This class will send a message if file size is bigger than what we limit it for.
 *
 * Where to limit: application.properties as following:
 * spring.servlet.multipart.max-file-size=500KB
 * spring.servlet.multipart.max-request-size=500KB
 *
 * In this case we are limit it to 500KB.
 * */
@ControllerAdvice
public class FileUploadExceptionalAdvise  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<MessageResponse> handleMaxSizeException(MaxUploadSizeExceededException exc){
        return  ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse("File to large!"));
    }

}