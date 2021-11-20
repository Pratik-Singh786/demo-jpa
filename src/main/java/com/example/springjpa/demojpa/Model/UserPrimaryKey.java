package com.example.springjpa.demojpa.Model;

import javax.persistence.IdClass;

@IdClass(User.class)
public class UserPrimaryKey
{
   private int id;    //combination of these two fields should be unique always
    private String name;
  //  private String last_name;
}
