package com.nttdata.ffcustom;

import java.util.Arrays;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
public class Allresource {

	
	
	
	
	String[] varibleArray = new String[10];

	@Override
	public String toString() {
		return "Allresourcearray [varibleArray=" + Arrays.toString(varibleArray) + "]";
	} 

	
	
		
}
