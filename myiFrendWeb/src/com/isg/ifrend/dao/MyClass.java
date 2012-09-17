package com.isg.ifrend.dao;

import java.util.Arrays;
import java.util.Collections;

public class MyClass {

	public static int x = 7; 
    public int y = 3; 

	  public static void main(String[] arguments)
	  {
		  MyClass a = new MyClass();
		  MyClass b = new MyClass();
		  a.y = 5;
		  b.y = 6;
		  MyClass.x = 1;
		  b.x = 2;
		  System.out.println("a.y = " + a.y);//5
		  System.out.println("b.y = " + b.y);//6
		  System.out.println("SampleFoo.x = " + a.x);//1
		  System.out.println("b.x = " + b.x);//2
		  Arrays.asList(arguments);

	  }

	
}
