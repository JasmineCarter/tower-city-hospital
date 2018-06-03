package org.wecancodeit.cleveland.hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String name, String specialty, boolean isOperating) {
		super(empNumber, name, specialty); 
		this.isOperating = isOperating; 
		
	}

	public boolean isOperating() {
		return isOperating;
	}

	@Override
	public int calculatePay() {
		return 120000;
	}
}
