package com.hcl.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmailDetails {
	
    @Id
	private long userid;
	private String recipient;
    private String msgBody;
    private String subject;


}
