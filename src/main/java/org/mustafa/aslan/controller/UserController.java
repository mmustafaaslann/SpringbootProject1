package org.mustafa.aslan.controller;

import org.mustafa.aslan.entity.User;
import org.mustafa.aslan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable(name = "userId") Long userId) {
        return userService.get(userId);
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable(name = "userId") Long userId) {
        userService.delete(userId);
    }
}
