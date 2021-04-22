package com.beans;

public class Address {
	private String street;
	private String city;
	private String pinCode;
	public Address() {}
	public Address(String street, String city, String pinCode) {
		
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=");
		builder.append(street);
		builder.append(", city=");
		builder.append(city);
		builder.append(", pinCode=");
		builder.append(pinCode);
		builder.append("]");
		return builder.toString();
	}


}
