package com.example.demo;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Configuration

public class StudentConfig implements ApplicationContextAware {




    private Students currentStudents;
    private Students previousStudents;


    @Bean(name="students")
    public Students currentStudents() {

        Student st1= new Student(1,"Amit");
        Student st2= new Student(2,"Shuchi");

        List<Student> st = new ArrayList<>();


       st.add(st1);
       st.add(st2);

       currentStudents= new Students(st);



        return currentStudents;
    }




    @Bean (name="pstudents")

    public Students priviousStudents() {


        Student st1= new Student(1,"Shivi");
        Student st2= new Student(2,"Saanchi");

        List<Student> st = new ArrayList<>();


        st.add(st1);
        st.add(st2);

        previousStudents= new Students(st);



        return previousStudents;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
