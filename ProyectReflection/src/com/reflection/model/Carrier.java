package com.reflection.model;

public class Carrier extends Ship {

	public Carrier(int id, String name, int crew, int age, boolean combat, int agesOperativity, boolean operative) {
		super(id, name, crew, age, combat, agesOperativity, operative);
	}

	private int vehicles;

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

}
