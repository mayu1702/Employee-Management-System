/**package com.employeeManagement.EmployeeManagementSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	@NotEmpty
	@Size(min = 3, message = "User's name should be valid and consist of more than 2 letters")
	private String userName;
	@NotEmpty
	@Email(message = "Invalid email id")
	@Column(name = "Email_Id", unique = true, length = 20)
	private String email;
	
	public void setId(Integer userId) {
		this.userId = userId;
	}
	public Integer getId() {
		return userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return userName;
	}
	public void setMailId(String email) {
		this.email = email;
	}
	public String getMailId() {
		return email;
	}
	
	public User() {
		super();
	}
	
	
}
*/