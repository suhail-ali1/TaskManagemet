package com.hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Entity.task;
import com.hcl.Repository.taskRepository;

@Service
public class taskService {

	@Autowired
	taskRepository repo;
	
	public task addTask(task t)
	{
		return repo.saveAndFlush(t);
		
	}
	
	public List<task> getTaskByUserid(long userid)
	{
		return repo.findAllByUserid(userid);
		
	}
	
	public task updateTask(task t)
	{
		return repo.save(t);
		
	}
	
	public task deleteTask(long taskid)
	{
		task t = repo.findById(taskid).get();
		repo.deleteById(taskid);
		return t;
	}
	
	
}
