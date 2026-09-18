package com.adl.week1.assign1;
import java.math.BigDecimal;

/*
 **
 * @author Darryn
 * @since Sept 17 2026
 * Child class of Converter that converts CAD to USD
 */

public class CadToUsd extends Converter {

	public CadToUsd() 
	{
		super("CAD", "USD", BigDecimal.valueOf(1.39), true);
	}

}
