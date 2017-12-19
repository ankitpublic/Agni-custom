package com.nttdata.ffcustom;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {

	

	String firstName, lastName, gender, ssn ;
	
	Double salary;
	
	
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", ssn=" + ssn
				+ ", salary=" + salary + "]";
	}

	
}
