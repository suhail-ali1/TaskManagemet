package com.hcl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.Entity.task;
import com.hcl.Service.taskService;

@RestController
@RequestMapping("task")
@CrossOrigin
public class taskController {

	@Autowired
	taskService service;
	
	@PostMapping("/addtask")
	public task addTask(@RequestBody task t)
	{
		return service.addTask(t);
	}
	
	@GetMapping("/get/{userid}")
	public List<task> getTaskByUser(@PathVariable long userid)
	{
		return service.getTaskByUserid(userid);
	}
	
	@PutMapping("/update")
	public task UpdateTask(@RequestBody task t)
	{
	  return service.updateTask(t);	
	 	
	}
	
	@DeleteMapping("/delete/{taskid}")
	public task deleteTask(@PathVariable long taskid )
	{
		return service.deleteTask(taskid);
		
	}
	
	
}
