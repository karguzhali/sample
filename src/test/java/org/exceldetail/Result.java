package org.exceldetail;

import org.junit.runner.JUnitCore;

public class Result {
	public static void main(String[] args) {
		/////Run Count////
		org.junit.runner.Result r=JUnitCore.runClasses(BaseClass.class,SecondClass.class);
		int runCount=r.getRunCount();
		System.out.println(runCount);
		int ignoreCount=r.getIgnoreCount();
		System.out.println(ignoreCount);
		int failureCount=r.getFailureCount();
		System.out.println(failureCount);
		long runTime=r.getRunTime();
		System.out.println(runTime);
	}
	

	}