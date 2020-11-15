package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.service.BookService;

public class Manager {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		BookService bookService = context.getBean("bookService", BookService.class);
		bookService.save();
		System.out.println("done");
		context.close();
	}
}
