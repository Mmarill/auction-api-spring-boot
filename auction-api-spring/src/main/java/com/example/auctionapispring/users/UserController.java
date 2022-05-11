package com.example.auctionapispring.users;

import com.example.auctionapispring.payload.response.MessageResponse;
import com.example.auctionapispring.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserRepository userRepository;

    UserDetailsImpl currentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
       return userDetails;
    }

    @GetMapping("/loggedin")
    @PreAuthorize("hasRole('ROLE_USER')")
    public User get() {
        User user = userRepository.findById(currentUser().getId()).get();
        user.setPassword("");
        user.setRoles(null);

        return user;
    }

    @GetMapping("/all")
    public List <User> getUsers() {
        return userRepository.findAll();
    }

    //Get user by id, throw exception if not found. Update credentials, save user.
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(
            @PathVariable String id,
            @RequestBody User userDetails) throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found on : "+ id));

        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        user.setRoles(userDetails.getRoles());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(new MessageResponse("User updated successfully! " + updatedUser.getUsername() + " " + updatedUser.getRoles()));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(
            @PathVariable String id) throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found on : " + id));

        userRepository.delete(user);
        return ResponseEntity.ok(new MessageResponse("User deleted"));
    }

    @GetMapping("/user/{id}")
    public User getSingleUser(
            @PathVariable String id) throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found on : " + id));
        return user;
    }
}
