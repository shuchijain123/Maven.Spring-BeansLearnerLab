package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest



@ContextConfiguration(classes = StudentConfig.class)




public class StudentConfigTest  {


    ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);




    @Autowired
    StudentConfig students;
    @Qualifier("students")



    @Test
    public void testcurrentStudents() {


        Students currentstudent = students.currentStudents();




        System.out.println(currentstudent.findAll().toString());

        Assert.assertEquals(2, currentstudent.size());


    }


    @Autowired
    private ApplicationContext applicationContext;



    @Test
    public void priviousStudentsTest() {


    Students previousstudents =  applicationContext.getBean("pstudents",Students.class);

        System.out.println(previousstudents.findAll().toString());


        Assert.assertEquals(2, previousstudents.size());



    }
}