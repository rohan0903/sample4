package com.howtodoinjava.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import com.howtodoinjava.rest.controller.ExampleController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class SpringBootDemoApplicationTests 
{   
   
	@Autowired
	ExampleController exampleController;

	@Test
	public void exampleTest()
	{
		String result=exampleController.home();
		Assert.assertEquals(result, "Hello World");
	}

}
