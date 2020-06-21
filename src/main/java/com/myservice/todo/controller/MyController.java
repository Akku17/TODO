package com.myservice.todo.controller;

import com.myservice.todo.model.Todo;
import com.myservice.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Controller
public class MyController implements ControllerInterface {

	@Autowired
	private TodoService todoService;

	public List<Todo> showTodos(String name){
		List<Todo> list=todoService.getTodosByUser(name);
		return list;
	}

	public String addTodo(Todo todo) {
		todoService.addTodo(todo.getUserName(), todo.getDescription(), todo.getTargetDate(),todo.isDone());
		return "Success";
	}

	public String deleteTodo(long id) {
		todoService.deleteTodo(id);
		return "Success";
	}

	public String showUpdateTodoPage(long id, Todo todo) {
		todo.setId(id);
		todoService.updateTodo(todo);
		return "Success";
	}

}
