package com.example.springjpa.demojpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity  //it will simply map the java class into the table
@Table(name="myUser  ")
public class User
{

  public User()  //any entity like spring,hibernate or any if it required default it required constructor then it need setters
  {

  }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;// INTEGER id,recommended not to use primitive data type,if error occurs it will return null

    private String name;
    private String  last_name;

    @Column(name="nation")
    private String country;

    private int age;

    public User(int id, String name, String last_name,String country, int age )
    {
        this.id = id;
        this.name = name;
        this.last_name=last_name;
        this.country = country;
        this.age = age;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } //we need setters because outside this class fields are not present because fileds are private

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }



}
