package com.example.demo;

public class Student extends Person implements Learner {





    double totalStudyTime =4;



    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime= totalStudyTime+numberOfHours;

    }


    public double getTotalStudyTime() {
        return totalStudyTime;


    }




}
