package org.wecancodeit.cleveland.hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;

	public Nurse(String empNumber, String name, int numPatients) {
		this.empNumber = empNumber;
		this.name = name; 
		this.numPatients = numPatients; 
		
	}
//can get rid of this it's in the employee class
	
//	public String getNumber() {
//		return empNumber;
//	}
//
//	public String getName() {
//		return name; 
//	}

	public int getNumPatients() {
		return numPatients;
	}

	@Override
	public void careForPatient(Patient anyPatient) {
		anyPatient.receiveHealth(5);
	}

	@Override
	public void drawBlood(Patient anyPatient) {
		anyPatient.giveBlood(5);
	}

	public int calculatePay() {
		return 50000;
	}

	

	
}
