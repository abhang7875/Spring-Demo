package com.simplilearn.workshop.service;

import java.util.List;

import com.simplilearn.workshop.domain.ToDo;
import com.simplilearn.workshop.repository.ToDoRepository;
import com.simplilearn.workshop.repository.ToDoRepositoryImpl;

public class ToDoServiceImpl implements ToDoService{
	private ToDoRepository todoRepo = new ToDoRepositoryImpl();

	public List<ToDo> findAll() {
		return todoRepo.findAll();
	}

	public ToDo save(ToDo todo) {
		return todoRepo.save(todo);
	}

	public ToDo deleteById(long theId) {
		return todoRepo.deleteById(theId);
	}

	public ToDo findById(long theId) {
		return findById(theId);
	}
	
}
