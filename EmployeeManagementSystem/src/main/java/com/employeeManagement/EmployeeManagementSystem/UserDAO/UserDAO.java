/**package com.employeeManagement.EmployeeManagementSystem.UserDAO;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeManagement.EmployeeManagementSystem.Entity.User;
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
	List<User> findAll(Sort sort);
	Optional<User> findByemailId(String email);
    // Check if an email exists
    boolean existsByemailId(String email);
	
}
*/