package org.cts.test.MavenTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class A {
	
	@Test
	public void logic1() {
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(false);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}
    @Ignore
	@Test
	public void logic2() {
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}


	@Test
	public void logic3() {
Assert.assertTrue(true);
Assert.assertTrue(false);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}
}
