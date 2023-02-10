package com.example.BasicSpringSqlConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;   //This is an object

   //add the user
    public String createUser(User user){
        userRepository.save(user);
        return "User added Successfully.";
    }

    //Get the user by id
    public User getUser(int id){
        User user = userRepository.findById(id).get();   //Help you find the Entity by primary key.
        return user;
    }
}
