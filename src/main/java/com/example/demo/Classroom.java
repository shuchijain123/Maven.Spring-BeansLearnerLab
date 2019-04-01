package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Classroom {




    private Students  myStudents;
    private Instructors  myInstructors;

    public Classroom(Students myStudents, Instructors myInstructors) {
        this.myStudents = myStudents;
        this.myInstructors = myInstructors;
    }

    public Students getMyStudents() {
        return myStudents;
    }

    public void setMyStudents(Students myStudents) {
        this.myStudents = myStudents;
    }

    public Instructors getMyInstructors() {
        return myInstructors;
    }

    public void setMyInstructors(Instructors myInstructors) {
        this.myInstructors = myInstructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){


       teacher.lecture(myStudents, numberOfHours);


    }
}
