package com.myservice.todo.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myservice.todo.model.Todo;

@Controller
public interface ControllerInterface {
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
	public @ResponseBody List<Todo> showTodos(@RequestParam String name);
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public @ResponseBody String addTodo(@RequestBody Todo todo);
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.DELETE)
	public @ResponseBody String deleteTodo(@RequestParam long id);
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.PUT)
	public @ResponseBody String showUpdateTodoPage(@RequestParam long id,@RequestBody Todo todo);
	
//	@GET
//	@Path("/list-todos")
//	@Produces(MediaType.APPLICATION_JSON)
//	public @ResponseBody List<Todo> showTodos(@RequestParam String name);
//	
//	@POST
//	@Path("/add-todo")
//	@Produces(MediaType.TEXT_PLAIN)
//	public @ResponseBody String addTodo(@RequestBody Todo todo);
//	
//	@DELETE
//	@Path("/delete-todo")
//	@Produces(MediaType.TEXT_PLAIN)
//	public @ResponseBody String deleteTodo(@RequestParam long id);
//	
//	@PUT
//	@Path("/update-todo")
//	@Produces(MediaType.TEXT_PLAIN)
//	public @ResponseBody String showUpdateTodoPage(@RequestParam long id,@RequestBody Todo todo);
}
