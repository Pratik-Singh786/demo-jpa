package com.example.springjpa.demojpa.Repository;

import com.example.springjpa.demojpa.Model.User;
import com.example.springjpa.demojpa.Model.UserPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository  extends JpaRepository<User,Integer>
{
    //@Query("select *from user where id=2")
    //public List<User> getUserCustom();
  


}
