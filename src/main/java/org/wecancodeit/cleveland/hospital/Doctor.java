package org.wecancodeit.cleveland.hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public Doctor(String empNumber, String name, String specialty) {
		this.empNumber = empNumber;
		this.name = name;
		this.specialty = specialty;
	}

	@Override
	public void careForPatient(Patient anyPatient) {
		anyPatient.receiveHealth(10); 
		
	}

	@Override
	public void drawBlood(Patient anyPatient) {
		anyPatient.giveBlood(5); 
	}

	@Override
	public int calculatePay() {
		return 90000;
	}

}
