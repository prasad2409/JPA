package com.demoprojects.jpaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    public String addUser(User user) {
        repository.save(user);
        return "User Added Successfully";
    }
    public List<User> getUsers(){
        return repository.findAll();
    }
    public User getUser(int id){
        return repository.findById(id).get();
    }
    public String updateUser(int id){
        User temp = getUser(id);
        temp.setMobNo("9652021586");
        temp.setAge(33);
        repository.save(temp);
        return "Updated";
    }
    public String deleteUser(int id){
        repository.deleteById(id);
        return "Deleted";
    }
    public String deleteUsers(){
        repository.deleteAll();
        return "Full Entity Delete";
    }
}
