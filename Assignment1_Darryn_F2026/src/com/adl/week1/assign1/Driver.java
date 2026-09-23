package com.adl.week1.assign1;

/**
 * @author Darryn
 * @since Sept 17 2026
 * Driver class
 */

public class Driver {

	public static void main(String[] args) {
		
		
		// Creating Calculation Objects
		GradeCal c0 = new GradeCal();
		CadToUsd c1 = new CadToUsd();
		MileConverter c2 = new MileConverter();
		LiterConverter c3 = new LiterConverter();
		
		
		 
		// * The super class can be used to construct conversions
		 
		//Converter c1 = new Converter("CAD", "USD", 1.39, true);
		//Converter c2 = new Converter("Kilometers", "Miles", 1.609, true);
		//Converter c3 = new Converter("Liters", "Gallons", 3.785, true);
		//Converter c4 = new Converter("CM", "INCHES", 2.54, true);
		//Converter c5 = new Converter("INCHES","CM",  2.54, false);
		
		
		// Invoking Methods of Objects
		c0.getGradeAverage();
		c1.conversion();
		c2.conversion();
		c3.conversion();
		//c4.conversion();
		//c5.conversion();
		

	}

}
