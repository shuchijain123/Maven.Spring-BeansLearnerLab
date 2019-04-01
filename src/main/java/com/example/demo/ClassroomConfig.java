package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.List;

@Configuration
public class ClassroomConfig {

  private Classroom currentCohort=null;
  private Classroom previousCohort=null;




    @Autowired

    StudentConfig StudentConfig;


    @Autowired


    InstructorsConfig InstructorsConfig;



    @Bean(name="currentclassroom")




    public Classroom currentCohort(){

     Students currentstudent = StudentConfig.currentStudents();
     Instructors Instructots = InstructorsConfig.Instructors();



   Classroom classroom = new Classroom(currentstudent, Instructots);

   return classroom;

    }




    @Bean(name="previousclassroom")

    public Classroom previousCohort(){


        Students previousstudent = StudentConfig.priviousStudents();
        Instructors previousInstructots = InstructorsConfig.Instructors();




        Classroom classroom = new Classroom(previousstudent, previousInstructots);

        return classroom;
    }

}
