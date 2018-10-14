package org.application;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tests.IndexTest;

@RunWith(SpringJUnit4ClassRunner.class)
public class SuiteTests {

	@Test
	public void testInitApplication() {
		JUnitCore.runClasses(IndexTest.class);
	}
}
