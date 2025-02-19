package com.employeeManagement.EmployeeManagementSystem.employeeService;

/**import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeManagement.EmployeeManagementSystem.DAO.employeeDAO;
import com.employeeManagement.EmployeeManagementSystem.Entity.Employee;


@Service*/
public class EmployeeService {
	//Injecting dependencies
	/*@Autowired
	private employeeDAO empDAO;*/
	//retrieve all employee data
	/*public List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<Employee>();
		empDAO.findAll().forEach(empList::add);
		return empList;
	}*/
	//save the data
	/**public Employee saveEmployee(@Valid Employee employee) {
		return empDAO.save(employee);
	}*/
	//get employee name
	/**public Optional<Employee> getEmployeeName(String employeeName){
		return empDAO.findByEmployeeName(employeeName);
	}*/
	//save employee
	/**public Employee saveEmployee(Employee employee) {
		if(empDAO.existsByemailId(employee.getEmailId())) {
			throw new RuntimeException("Employee with this email already exists!");
		}
		return empDAO.save(employee);
	}*/
	
	//fetch an employee by ID
	/*public Optional<Employee> getEmployeeById(Integer id){
		return empDAO.findById(id);
	}*/
	
	//update 
	 /**public Employee updateEmployee(Employee employee) 
     {
         empDAO.findById(employee.getEmployeeId()).orElseThrow(null);
         return empDAO.save(employee);
     }*/
	 //delete
	 /**public boolean deleteEmployee(int id) {
		 if(empDAO.existsById(id)) {
			 empDAO.deleteById(id);
			 return true;
		 }
		 return false;
	 }*/
	// Search employee by name
	    /**public Employee findByEmployeeName(String employeeName) {
	        return empDAO.findByEmployeeName(employeeName)
	                .orElseThrow(() -> new RuntimeException("Employee not found with name: " + employeeName));
	    }*/
	 
	  //sort using employee name
	    /**public List<Employee> getEmployeesSortedByName() {
	        return empDAO.findAllByOrderByEmployeeNameAsc();
	    }*/
	  //sort using employee name in descending order
	    /**public List<Employee> getEmployeesSortedByNameDesc(){
	        return empDAO.findEmployeeNameInDesc();
	    }*/
	 // Retrieve employee by email ID
	    /**public Optional<Employee> getEmployeeByEmail(String emailId) {
	        return empDAO.findByEmailId(emailId);
	    }*/
	    //user email id check
	    /**public Optional<Employee> getUserByEmail(String emailId) {
	        return empDAO.findByEmailId(emailId);
	    }*/
}
