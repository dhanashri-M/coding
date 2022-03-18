package com.infy.entity;

import java.time.LocalDate;
import java.util.Objects;

import com.infy.dto.ManufacturingUnit;

public class Employee {
	private Integer employeeId;
	private String emailid;
	private String name;
	private LocalDate dateOfBirth;
	private ManufacturingUnit manufacturingUnit;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ManufacturingUnit getManufacturingUnit() {
		return manufacturingUnit;
	}
	public void setManufacturingUnit(ManufacturingUnit manufacturingUnit) {
		this.manufacturingUnit = manufacturingUnit;
	}
	
	public Employee(Integer employeeId, String emailid, String name, LocalDate dateOfBirth,
			ManufacturingUnit manufacturingUnit) {
		super();
		this.employeeId = employeeId;
		this.emailid = emailid;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.manufacturingUnit = manufacturingUnit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailid, employeeId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(emailid, other.emailid) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emailid=" + emailid + ", name=" + name + ", getEmployeeId()="
				+ getEmployeeId() + ", getEmailid()=" + getEmailid() + ", getName()=" + getName() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
