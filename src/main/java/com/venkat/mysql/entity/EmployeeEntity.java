package com.venkat.mysql.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class EmployeeEntity {
	
	@Id
	private int id;
	
	private String name;
	
	private String gender;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	private String experience;

}
