/**package com.employeeManagement.EmployeeManagementSystem.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.EmployeeManagementSystem.Entity.User;
import com.employeeManagement.EmployeeManagementSystem.UserDAO.UserDAO;

@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	//retrieve all user data
		public List<User> getUsers(){
			List<User> usersList = new ArrayList<User>();
			userDAO.findAll().forEach(usersList::add);
			return usersList;
			
		}
	
}
*/