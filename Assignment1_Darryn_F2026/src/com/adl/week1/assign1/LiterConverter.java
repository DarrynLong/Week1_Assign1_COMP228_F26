package com.adl.week1.assign1;
import java.math.BigDecimal;

/*
 **
 * @author Darryn
 * @since Sept 17 2026
 * Child class of Converter that converts Liters to Gallons
 */

public class LiterConverter extends Converter{
	
	public LiterConverter() 
	{
		super("Liters", "Gallons", BigDecimal.valueOf(3.785), true);
	}

}
