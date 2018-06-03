package org.wecancodeit.cleveland.hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse anyNurse = new Nurse("3", "jackie", 6);
	Patient anyPatient = new Patient();
	Patient verySickpatient = new Patient(1, 1);

	@Test
	public void shouldRenderProperNurseProperties() {
		String number = anyNurse.getNumber();
		String name = anyNurse.getName();
		int numPatients = anyNurse.getNumPatients();
		assertEquals("3", number);
		assertThat(name, is("jackie"));
		assertEquals(6, numPatients);

	}

	@Test
	public void shouldIncreasePatientHealthFrom10To15() {
		anyNurse.careForPatient(anyPatient);
		int checkHealth = anyPatient.getHealth();
		assertEquals(15, checkHealth);
	}

	@Test
	public void shouldLowerBloodLevelsFrom10To5() {
		anyNurse.drawBlood(anyPatient);
		int checkBlood = anyPatient.getBlood();
		assertEquals(5, checkBlood);

	}

	@Test
	public void shouldHaveSalaryOf50000() {
		int salary = anyNurse.calculatePay();
		assertEquals(50000, salary);
	}
}
