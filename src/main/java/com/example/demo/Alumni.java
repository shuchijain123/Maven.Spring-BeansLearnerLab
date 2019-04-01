package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class Alumni {


    @Autowired
    @Qualifier("pstudents")
    Students psstudents;


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @PostConstruct
    public void executeBootcamp(){

        double numberOfHoursToTeachEachStudent = 1200;


     instructors.forEach(instructor -> instructor.lecture(psstudents,numberOfHoursToTeachEachStudent));


    }

    public Students getPsstudents() {
        return psstudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}




