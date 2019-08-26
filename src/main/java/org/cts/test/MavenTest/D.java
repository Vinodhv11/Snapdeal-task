package org.cts.test.MavenTest;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class D {
	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(A.class, B.class);

		System.out.println("Failed testcases:" + rs.getFailureCount());
		System.out.println("ignored testcases:" + rs.getIgnoreCount());
		int c = rs.getRunCount();
		System.out.println(c);

		System.out.println("Runtime:" + rs.getRunTime());

		List<Failure> f = rs.getFailures();
		for (Failure x : f) {
			System.out.println(x);
		}

		System.out.println("Suite status:" + rs.wasSuccessful());

	}

}
