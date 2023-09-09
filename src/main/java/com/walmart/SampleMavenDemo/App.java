package com.walmart.SampleMavenDemo;

import com.walmart.SampleMavenDemo.Model.Employee;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int square (int x){
		return x*x;
	}
    public static void main( String[] args )
    {
        /*ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Employee e=ctx.getBean("employee",Employee.class);
        Employee e1=ctx.getBean("employee1",Employee.class);
        System.out.println(e);
        System.out.println(e1);*/
    	System.out.println(square(5));
    }
}
