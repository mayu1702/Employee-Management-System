package com.employeeManagement.EmployeeManagementSystem.DAO;

//import java.util.List;
import java.util.Optional;

//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeManagement.EmployeeManagementSystem.Entity.Employee;

//import org.springframework.data.domain.Sort;

@Repository
public interface employeeDAO extends JpaRepository<Employee, Integer>{
	// Method to find employee by name
    //Optional<Employee> findByEmployeeName(String employeeName);
    
    // Method to find all employees and sort by name
    //List<Employee> findAll(Sort sort);
    
 // Find user by email (useful for authentication or uniqueness checks)
      Optional<Employee> findByemailId(String emailId);
     // Check if an email exists
     //boolean existsByemailId(String emailId);
     
     //sort the employees by name
     //List<Employee> findAllByOrderByEmployeeNameAsc();
      //sort by employee name by descending order
     //List<Employee> findEmployeeNameInDesc();
     
  // Find employee by email ID
     //Optional<Employee> findByEmailId(String emailId);
}
