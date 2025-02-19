package com.employeeManagement.EmployeeManagementSystem.Entity;

/**import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Entity*/
public class Employee {
	
	/**@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	
	@NotEmpty
	@Size(min = 3, message = "Employee's name should be valid and consist of more than 2 letters")
    private String employeeName;
	
	@NotEmpty
	@Size(min = 10, message = "Phone number must contain 10 digits")
	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits")
    private String employeePhoneNumber;
	
	@NotEmpty
	@Email(message = "Invalid email id")
	@Column(name = "Email_Id", unique = true, length = 20)
    private String emailId;
	
	@NotEmpty
	@Size(min = 8, message = "Your password must contain atleast 8 characters & contain one uppercase, one lowercase and one special character")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
    message = "Password must contain at least 8 characters, including one uppercase, one lowercase, one digit, and one special character")
    private String employeePassword;
	
	@NotEmpty(message = "Your address should not be empty")
    private String employeeAddress;
	
	@NotEmpty(message = "Mention gender")
    private String employeeGender;
	
	@NotEmpty(message = "Department must not be empty")
    private String employeeDepartment;
	
	@NotEmpty
    private String employeeSkills;
	
	public Employee() {}
    public Employee(Integer employeeId, String employeeName, String employeePhoneNumber, String emailId,
            String employeePassword, String employeeAddress, String employeeGender,
            String employeeDepartment, String employeeSkills) {

this.employeeId = employeeId;
this.employeeName = employeeName;
this.employeePhoneNumber = employeePhoneNumber;
this.emailId = emailId;
this.employeePassword = employeePassword;
this.employeeAddress = employeeAddress;
this.employeeGender = employeeGender;
this.employeeDepartment = employeeDepartment;
this.employeeSkills = employeeSkills;
}

public Integer getEmployeeId() {
return employeeId;
}

public void setEmployeeId(Integer employeeId) {
this.employeeId = employeeId;
}

public String getEmployeeName() {
return employeeName;
}

public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}

public String getEmployeePhoneNumber() {
return employeePhoneNumber;
}

public void setEmployeePhoneNumber(String employeePhoneNumber) {
this.employeePhoneNumber = employeePhoneNumber;
}

public String getEmailId() {
return emailId;
}

public void setEmailId(String emailId) {
this.emailId = emailId;
}

public String getEmployeePassword() {
return employeePassword;
}

public void setEmployeePassword(String employeePassword) {
this.employeePassword = employeePassword;
}

public String getEmployeeAddress() {
return employeeAddress;
}

public void setEmployeeAddress(String employeeAddress) {
this.employeeAddress = employeeAddress;
}

public String getEmployeeGender() {
return employeeGender;
}

public void setEmployeeGender(String employeeGender) {
this.employeeGender = employeeGender;
}

public String getEmployeeDepartment() {
return employeeDepartment;
}

public void setEmployeeDepartment(String employeeDepartment) {
this.employeeDepartment = employeeDepartment;
}

public String getEmployeeSkills() {
return employeeSkills;
}

public void setEmployeeSkills(String employeeSkills) {
this.employeeSkills = employeeSkills;
}*/
	
}
