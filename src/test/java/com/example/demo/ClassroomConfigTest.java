package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;


import org.junit.Test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest





public class ClassroomConfigTest {







   @Autowired
   @Qualifier("students")
   Students students;


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @Autowired
    ClassroomConfig classroom;
    @Qualifier("currentclassroom")



    @Test
    public void currentCohort() {


        Classroom currClassroom =  classroom.currentCohort();



        System.out.println(currClassroom.getMyStudents().findAll().toString());
        System.out.println(currClassroom.getMyInstructors().findAll().toString());




    }

    @Test
    public void previousCohort() {


        Classroom previousClassroom =  classroom.previousCohort();



        System.out.println(previousClassroom.getMyStudents().findAll().toString());
        System.out.println(previousClassroom.getMyInstructors().findAll().toString());
    }
}