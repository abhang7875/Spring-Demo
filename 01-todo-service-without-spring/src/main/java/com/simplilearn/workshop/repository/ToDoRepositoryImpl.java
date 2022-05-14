package com.simplilearn.workshop.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.simplilearn.workshop.domain.ToDo;

public class ToDoRepositoryImpl implements ToDoRepository {
	private static List<ToDo> todos = new ArrayList<ToDo>();
	private static int counter = 0;
	static {
		todos.add(new ToDo(++counter, "simplilearn", "Learn to Dance", new Date(), false));
		todos.add(new ToDo(++counter, "simplilearn", "Learn to Sing", new Date(), false));
		todos.add(new ToDo(++counter, "simplilearn", "Learn to Skate", new Date(), false));
	}

	public List<ToDo> findAll() {
		return todos;
	}

	public ToDo save(ToDo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++counter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

	public ToDo deleteById(long theId) {
		ToDo temp = findById(theId);
		if(temp == null) return null;
		if(todos.remove(temp)) return temp;
		return null;
	}

	public ToDo findById(long theId) {
		for (ToDo td : todos) {
			if (td.getId() == theId) {
				return td;
			}
		}
		return null;
	}
}
