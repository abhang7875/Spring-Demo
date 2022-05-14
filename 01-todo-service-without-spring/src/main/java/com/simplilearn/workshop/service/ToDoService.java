package com.simplilearn.workshop.service;

import java.util.List;

import com.simplilearn.workshop.domain.ToDo;

public interface ToDoService {
	public List<ToDo> findAll();
	public ToDo save(ToDo todo);
    public ToDo deleteById(long theId);
    public ToDo findById(long theId);
}
