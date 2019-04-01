package com.example.demo;

import org.junit.Test;


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

import static org.junit.Assert.*;



@RunWith(SpringRunner.class)
@SpringBootTest



@ContextConfiguration(classes = InstructorsConfig.class)

public class InstructorsConfigTest {


    @Autowired
    InstructorsConfig usainstructors;
    @Qualifier("instructors")

    @Test
    public void tcUSAInstructorsTest() {


        Instructors USAInstructor = usainstructors.tcUsaInstructors();




        System.out.println(USAInstructor.findAll().toString());

        Assert.assertEquals(2, USAInstructor.size());



    }


    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void tcUKInstructorsTest() {


        Instructors ukinstructors =  applicationContext.getBean("UKinstructors",Instructors.class);

        System.out.println(ukinstructors.findAll().toString());


        Assert.assertEquals(4, ukinstructors.size());
    }




    @Test
    public void ZipinstructorsTest() {


        Instructors zipinstructors =  applicationContext.getBean("Zipinstructors",Instructors.class);

        System.out.println(zipinstructors.findAll().toString());


        Assert.assertEquals(4, zipinstructors.size());


    }
}