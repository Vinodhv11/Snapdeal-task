package org.cts.test.MavenTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {

	@Test
	public void logic4() {
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(false);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}
    @Ignore
	@Test
	public void logic5() {
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}


	@Test
	public void logic6() {
Assert.assertTrue(true);
Assert.assertTrue(false);
Assert.assertTrue(true);
Assert.assertTrue(true);
Assert.assertTrue(true);

	}

}
