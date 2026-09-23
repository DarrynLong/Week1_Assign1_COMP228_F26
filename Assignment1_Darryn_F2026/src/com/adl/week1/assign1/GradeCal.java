package com.adl.week1.assign1;
import java.util.Scanner;

/**
 * @author Darryn
 * @since Sept 17 2026
 * Calculates Grade average of 6 courses
 */

public class GradeCal {
	
	// Variable Declaration
	double[] marks = new double[6];
    double totalMarks = 0;
    Scanner input = new Scanner(System.in);
    
    // Method for getting grade average
    public void getGradeAverage() 
    {
    	System.out.println("--- Student Grade Calculator (6 Courses) ---");
    	
    	// Loop to take input for each course
    	for (int i = 0; i < 6; i++) 
    	{
	        System.out.print("Enter marks obtained in Course " + (i + 1) + " (out of 100): ");
	        marks[i] = input.nextDouble();
	        
	        // Add current course marks to total
	        totalMarks += marks[i];
    	}
    	
    	// Calculate the average percentage
        double averagePercentage = totalMarks / 6;
        
        // Determine the grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display the final results
        System.out.println("\n----------------------------");
        System.out.printf("Total Marks: %.2f / 600.00\n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Final Grade: " + grade);
        System.out.println("----------------------------\n");
    }
}
