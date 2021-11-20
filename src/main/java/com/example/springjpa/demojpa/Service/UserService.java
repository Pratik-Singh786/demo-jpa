package com.example.springjpa.demojpa.Service;

import com.example.springjpa.demojpa.Model.User;
import com.example.springjpa.demojpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //or @Controller
public class UserService //the pupose of this UserService class is to define the api functions and linked them to the JpaRepository
{
  @Autowired
  UserRepository userRepository;
  public List <User > getUsers()

  {
      return userRepository.findAll();
  }

  public User getUser(int id)
  {
      return userRepository.findById(id).get(); //get will return null if id is not present
  }
  public void insertUser(User user)
  {
    userRepository.save(user); //save() will only take the generic type you have used during creating jpa repository which is User user
  }






}
