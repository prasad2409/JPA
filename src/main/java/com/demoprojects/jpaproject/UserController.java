package com.demoprojects.jpaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return service.addUser(user);
    }
    @GetMapping("/get_users")
    public List<User> getUsers(){
        return service.getUsers();
    }
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return service.getUser(id);
    }
    @PutMapping("/update_user")
    public String updateUser(@RequestParam("id") int id){
        return service.updateUser(id);
    }
    @DeleteMapping("/delete_user")
    public String deleteUser(@RequestParam("id") int id){
        return service.deleteUser(id);
    }
    @DeleteMapping("/delete_users")
    public String deleteUsers(){
        return service.deleteUsers();
    }
}
