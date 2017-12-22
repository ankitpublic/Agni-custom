package com.nttdata.ffcustom;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
public class Diagnosis {

	String id, admid, diagcode , diagdesc;

	@Override
	public String toString() {
		return "Diagnosis [id=" + id + ", admid=" + admid + ", diagcode=" + diagcode + ", diagdesc=" + diagdesc + "]";
	}

	
	
		
}
