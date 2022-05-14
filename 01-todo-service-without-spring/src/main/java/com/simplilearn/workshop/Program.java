package com.simplilearn.workshop;

import com.simplilearn.workshop.service.ToDoService;
import com.simplilearn.workshop.service.ToDoServiceImpl;

public class Program {
	public static void main(String[] args) {
		ToDoService todoServ = new ToDoServiceImpl();
		System.out.println(todoServ.findAll().get(0).getDescription());
	}
}
