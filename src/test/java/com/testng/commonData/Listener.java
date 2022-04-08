package com.testng.commonData;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Listener implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) {
		annotation.setRetryAnalyzer(MyRetry.class);
	}
}
