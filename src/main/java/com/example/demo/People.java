package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {


    private final List<PersonType> myList;


    public People(List<PersonType> myList) {

        this.myList = myList;
    }

    public void add(PersonType person) {


        myList.add(person);
    }


    public void remove(PersonType person) {


        myList.remove(person);
    }


    public int size() {


        int mySize = myList.size();
        return mySize;
    }


    public void clear() {

        myList.clear();
    }

    public Boolean hasNext() {

        int current = 0;
        if (current < myList.size()) {

            return true;
        } else {
            return false;
        }
    }


    public void addAll(Iterable<PersonType> personType) {

        for (PersonType ps : personType) {

            myList.add(ps);

        }
    }


    public PersonType findById(long id) {

        PersonType person =null;
        int i= (int) id;



         person =  myList.get(i);


       return person;

    }



    public List<PersonType> findAll() {
    PersonType person = null;

  List<PersonType> newList = new ArrayList<>();

      for (int i=0; i<myList.size();i++){

      person = myList.get(i);
      newList.add(person);

      }




        return newList;

    }



}
