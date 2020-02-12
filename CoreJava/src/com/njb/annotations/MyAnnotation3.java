package com.njb.annotations;

//Single-Value Annotation
//@MyAnnotation3(value=10)  
public @interface MyAnnotation3 {
	int value() default 0;
}
