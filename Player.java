package com.beans;

public class Player {
	private String name;
	private String skill;
	private String country;
	private double avgScore;

	public Player(String name,double avgScore) {

		this.avgScore = avgScore;
		this.name = name;
	}
	public Player(String name, String skill) {

		this.name = name;
		this.skill = skill;
	}

	public Player(String name, String skill, String country) {

	this.name = name;
	this.skill = skill;
	this.country = country;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(name);
		builder.append(", skill=");
		builder.append(skill);
		builder.append(", country=");
		builder.append(country);
		builder.append(", avgScore=");
		builder.append(avgScore);
		builder.append("]");
		return builder.toString();
	}

	

}
