package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration

public class InstructorsConfig {


    private Instructors techConnectUSA;
    private Instructors techConnectUK;
    private Instructors ZipCodeins;




    @Bean(name="instructors")
    public Instructors tcUsaInstructors() {



        Instructor ins1= new Instructor(1,"Leon");
        Instructor ins2= new Instructor(2,"Kris");

        List<Instructor> it = new ArrayList<>();


        it.add(ins1);
        it.add(ins2);

       techConnectUSA= new Instructors(it);



        return techConnectUSA;


    }




    @Bean(name="UKinstructors")
    public Instructors tcUkInstructors() {


        Instructor ins1= new Instructor(1,"Nhu");
        Instructor ins2= new Instructor(2,"Sanjeev");
        Instructor ins3= new Instructor(3,"Ankit");
        Instructor ins4= new Instructor(4,"Sanjay");

        List<Instructor> it = new ArrayList<>();


        it.add(ins1);
        it.add(ins2);
        it.add(ins3);
        it.add(ins4);

        techConnectUK= new Instructors(it);



        return techConnectUK;


    }


    @Primary
    @Bean(name="Zipinstructors")
    public Instructors Instructors() {


        Instructor ins1= new Instructor(1,"Nhu");
        Instructor ins2= new Instructor(2,"Leon");
        Instructor ins3= new Instructor(3,"Khris");
        Instructor ins4= new Instructor(4,"Wilhem");

        List<Instructor> it = new ArrayList<>();


        it.add(ins1);
        it.add(ins2);
        it.add(ins3);
        it.add(ins4);

        ZipCodeins= new Instructors(it);



        return ZipCodeins;


    }




}
