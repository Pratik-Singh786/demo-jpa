package com.example.springjpa.demojpa.Model;

import javax.persistence.*;

@Entity   //it is an entity class and hibernate will create ddl for it.
@Table(name="Bank")// it will create bank  table in users db
public class Bank
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
