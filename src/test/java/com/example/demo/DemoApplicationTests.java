package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {




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
    StudentConfig previousstudents;
    @Qualifier("pstudents")

    @Test
    public void priviousStudents() {




    }


	@Test
	public void contextLoads() {
	}

}
