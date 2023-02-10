package com.example.BasicSpringSqlConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;   //we have to use an object of the service Layer : so that we can call its function.

    //Adding the User
    @PostMapping("/addUser")
    public String createUser (@RequestBody() User user){
        //Try adding try-catch blocks as well
        return userService.createUser(user);
    }

    //Getting the User
    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }


}
