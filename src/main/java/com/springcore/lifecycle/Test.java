package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
//		Sample s1=(Sample) context.getBean("s1");
//		System.out.println(s1);
//		System.out.println("+++++++++++++++++++++++++++++++++");
//		Sample2 s2=(Sample2) context.getBean("s2");
//		System.out.println(s2);
		
		Example example= (Example) context.getBean("example");
		System.out.println(example);
	}
}
 