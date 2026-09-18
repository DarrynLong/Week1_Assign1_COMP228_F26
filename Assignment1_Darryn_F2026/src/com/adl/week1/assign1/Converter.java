package com.adl.week1.assign1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
 **
 * @author Darryn
 * @since Sept 17 2026
 * Super class Converter that handles all conversion processes 
 */

public class Converter {
	
		// Declaration
		BigDecimal value1, value2, conversionValue;
		String value1Name, value2Name;
		Scanner input = new Scanner(System.in);
		boolean divide = true;
		
		public Converter(String value1Name, String value2Name, BigDecimal conversionValue, boolean divide)
		{
			this.value1Name = value1Name;
			this.value2Name = value2Name;
			this.conversionValue = conversionValue;
			this.divide = divide;
		}
		


		public void conversion()
		{
				System.out.printf("---- CONVERT %s TO %s ----%n", value1Name, value2Name);
				System.out.printf("Please enter the amount of %s: %n", value1Name);
				
				try {
				value1 = input.nextBigDecimal();				
				
				
				// Calculation
				if (divide == true)
				{
					value2 = value1.divide(conversionValue, 4, RoundingMode.HALF_UP);
				}
				else
				{
					value2 = value1.multiply(conversionValue);
				}
				System.out.printf("%.2f %s is equal to %.4f %s%n", value1, value1Name, value2, value2Name);	
				System.out.println("----------------------------\n");
				}
				catch (Exception e)
				{
					System.out.println("Something went wrong!");
					System.out.println("Error: " + e.toString());
					input.nextLine();
					
				}
				
				
				
		}

}
