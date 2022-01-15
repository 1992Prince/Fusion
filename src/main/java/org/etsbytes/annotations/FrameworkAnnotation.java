package org.etsbytes.annotations;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME) // this means below annotation will be used by reflections to
															// get the values
@Target({ METHOD }) // where we want to apply this annotation
public @interface FrameworkAnnotation {

	// String author(); // this annotation is mandatory and if we don't specify it
	// then we will get the compile time error

	String author() default "Somesh"; // this anno parameter is optional since we gave the default value to it

}
