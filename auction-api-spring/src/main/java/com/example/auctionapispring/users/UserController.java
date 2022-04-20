package com.example.auctionapispring.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List <User> getUsers() {
        return userRepository.findAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(
            @PathVariable String id,
            @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found on : "+ id));

        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }
}
