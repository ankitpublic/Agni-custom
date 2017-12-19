package com.nttdata.ffcustom;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
public class Patient {

	String id, gender, dob, race, maritalstatus ,language , ppbelowpoverty ;

	@Override
	public String toString() {
		return "Patient [id=" + id + ", gender=" + gender + ", dob=" + dob + ", race=" + race + ", maritalstatus="
				+ maritalstatus + ", language=" + language + ", ppbelowpoverty=" + ppbelowpoverty + "]";
	}

	
		
}
