package controllers;

import jakarta.validation.Valid;
import models.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/user") /*EndPoint*/
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity getAllUsers() {
        var allUsers = repository.findAll();
        return ResponseEntity.ok(allUsers);
    }

}
