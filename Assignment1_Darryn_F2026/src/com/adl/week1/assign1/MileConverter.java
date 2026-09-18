package com.adl.week1.assign1;
import java.math.BigDecimal;

/*
 **
 * @author Darryn
 * @since Sept 17 2026
 * Child class of Converter that converts Kilometers to Miles
 */

public class MileConverter extends Converter{
	
	public MileConverter()
	{
		super("Kilometers", "Miles", BigDecimal.valueOf(1.609), true);
	}

}
