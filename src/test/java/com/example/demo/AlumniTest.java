package com.example.demo;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;




@RunWith(SpringRunner.class)
@SpringBootTest


public class AlumniTest {
    @Autowired
    @Qualifier("students")
    Students students;


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;



    @Autowired
    Alumni alumni;
    @Test
    public void executeBootcamp() {



        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;



        double expected = 1200;
        alumni.executeBootcamp();
        double actual = numberOfHoursPerInstructor;


        System.out.println(actual);

        Assert.assertEquals(expected,actual,0);


    }


}