package com.njb.annotations;

// Multi-Value Annotation
//@MyAnnotation3(value1=10,value2="Mr.X",value3="NewDelhi")  

public @interface MyAnnotation4 {
	int value1() default 1;
	String value2() default "";
	String value3() default "njb";
}
