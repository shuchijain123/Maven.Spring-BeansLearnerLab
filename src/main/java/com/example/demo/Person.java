package com.example.demo;

public class Person {


    private final long id;
    private String name="";

    public Person(long id,String name) {
        this.name = name;
        this.id =id;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override

    public String toString(){

        String myPerson = String.format("Name  : -->" + this.name + "Id   : -->" + this.id);

       return myPerson;

    }
}
