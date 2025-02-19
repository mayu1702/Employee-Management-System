package com.employeeManagement.EmployeeManagementSystem.Controller;

/**import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeManagement.EmployeeManagementSystem.Entity.Employee;
import com.employeeManagement.EmployeeManagementSystem.employeeService.EmployeeService;*/
//@RestController
public class EmployeeController {
	/**@Autowired
    EmployeeService employeeService;
    
   @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }*/
 // Fetch All Employees
    /*@GetMapping("/get/employee")
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }
    @GetMapping("/name/{employeeName}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable String employeeName)
    {
        Employee employee = employeeService.findByEmployeeName(employeeName);
        return ResponseEntity.ok(employee);
    }*/
  //sort using name
  	/*@GetMapping("/get/employees/sorted")
  	public ResponseEntity<List<Employee>> getEmployeesSortedByName() {
  	    List<Employee> employees = employeeService.getEmployeesSortedByName();
  	    return ResponseEntity.ok(employees);
  	}
  	@GetMapping("/sortedByNameDesc")
    public List<Employee> getEmployeesSortedByNameDesc() {
        return employeeService.getEmployeesSortedByNameDesc();
    }
  	
  	@GetMapping("/findByEmail")
    public Optional<Employee> getEmployeeByEmail(@RequestParam String email) {
        return employeeService.getEmployeeByEmail(email);
    }
    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
    	return employeeService.saveEmployee(employee);
    }
    */
    //update 
    /*@PutMapping("/update/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) 
    {
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        if (updatedEmployee != null) {
            return ResponseEntity.ok(updatedEmployee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }*/
    //delete
    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        boolean deleted = employeeService.deleteEmployee(id); 
    	return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build(); 
    			}*/
    
 // Login a user
 // Login a user
    /*@PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Employee loginRequest) {
        Optional<Employee> empOpt = employeeService.getUserByEmail(loginRequest.getEmailId());
          if (empOpt.isEmpty()) { 
                //if (empOpt.isPresent()){
            return ResponseEntity.status(401).body("User not found");
        }

        Employee emp = empOpt.get();
        if (emp.getEmployeePassword().equals(loginRequest.getEmployeePassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }*/
}
