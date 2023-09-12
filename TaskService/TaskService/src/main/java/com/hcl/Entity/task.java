package com.hcl.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long taskid;
	private long userid;
	private String tasktittle;
	private String taskdescription;
	private String priority;
	private String deadline;
	private String taskstatus;
	

}
