package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {

	Janitor anyJanitor = new Janitor("4", "rosie", true);
	

	@Test
	public void shouldRenderProperJanitorProperties() {
		String number = anyJanitor.getNumber();
		String name = anyJanitor.getName();
		boolean isSweeping = anyJanitor.isSweeping();
		assertEquals("4", number);
		assertThat(name, is("rosie"));
		assertTrue(isSweeping);

	}
	@Test
	public void shouldHaveSalaryOf40000() {
		int salary = anyJanitor.calculatePay();
		assertEquals(40000, salary);
	}
}
