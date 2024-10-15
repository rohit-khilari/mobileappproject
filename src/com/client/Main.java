package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("com/config/config.xml");
		Student st = ap.getBean("s",Student.class);
		//st.setMarks(97.30);
		//st.setName("rod johsan");
		System.out.println(st.getRollno());
		System.out.println(st.getName());
		System.out.println(st.getMarks());
		System.out.println(st.getAddress());
	}

}
