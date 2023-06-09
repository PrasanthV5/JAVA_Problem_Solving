package org.suiteLevel;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Way2 {

	@Test
	
	public void tc() {
		Result rc = JUnitCore.runClasses(B.class, A.class);
		
		System.out.println("Total test case run time: "+ rc.getRunTime());
		System.out.println("Total test case run count: "+ rc.getRunCount());
		System.out.println("Total test case failure count: "+ rc.getFailureCount());
		System.out.println("Total test case ignore count: "+ rc.getIgnoreCount());
		
		List<Failure> failures = rc.getFailures();
		
			for (Failure fails : failures) {
				
				System.out.println(fails);
				
			}


	}
}
