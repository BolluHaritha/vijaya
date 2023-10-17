package com.app.JUnitDemo;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;


public class ArgumentConversionexplicitSourceExplicit {
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testCaseWithExplicitArgumentConversion(
	        @ConvertWith(ToStringArgumentConvertor.class) String argument) {
 
	    Assertions.assertNotNull(TimeUnit.valueOf(argument));
	}


}
