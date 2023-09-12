package com.hcl.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.Entity.task;

@Repository
public interface taskRepository extends JpaRepository<task, Long>  {
	
	List<task> findAllByUserid(long userid);

}
