package com.reflection.model;

public abstract class Ship {

	private int id;
	private String name;
	private int crew;
	protected int age;
	private boolean combat;
	private int agesOperativity;
	private boolean operative;

	public Ship(int id, String name, int crew, int age, boolean combat, int agesOperativity, boolean operative) {
		super();
		this.id = id;
		this.name = name;
		this.crew = crew;
		this.age = age;
		this.combat = combat;
		this.agesOperativity = agesOperativity;
		this.operative = operative;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCombat() {
		return combat;
	}

	public void setCombat(boolean combat) {
		this.combat = combat;
	}

	public int getAgesOperativity() {
		return agesOperativity;
	}

	public void setAgesOperativity(int agesOperativity) {
		this.agesOperativity = agesOperativity;
	}

	public boolean isOperative() {
		return operative;
	}

	public void setOperative(boolean operative) {
		this.operative = operative;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

}
