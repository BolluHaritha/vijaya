package com.app.JUnitDemo;
import java.lang.annotation.Annotation;


public class MyAnnotationdemo {
	
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}


}
