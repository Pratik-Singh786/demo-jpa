package com.example.springjpa.demojpa.Controller;

import com.example.springjpa.demojpa.Model.Bank;
import com.example.springjpa.demojpa.Model.User;
import com.example.springjpa.demojpa.Repository.BankRepository;
import com.example.springjpa.demojpa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController   //purpose for the controller is  it is the  end point where the application is listening for the request
{
    @Autowired
    UserService userService;

    @Autowired
    BankRepository bankRepository;
    //instead of autowiring i am creating it manually

  /*  public  UserController()
    {
        this.userService=new UserService();
    }*/


    @GetMapping("/users")
    public List<User> getUser()
    {
        return userService.getUsers();
    }

    @GetMapping("/user")
    public List<User> getUserById(@RequestParam("id")int id) throws Exception
    {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user)
    {
        userService.insertUser(user);
    }

   @PostMapping("/bank")
    public void  createBank(@RequestBody Bank bank)
   {
      bankRepository.save(bank);
   }



}
