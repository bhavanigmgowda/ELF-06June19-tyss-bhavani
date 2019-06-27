package com.tyss.javaapp.stringclass;

public class Emp {
private final int ID;
private final String name;
private final double height;
private final char gender;
private final boolean status;
public Emp(int iD, String name, double height, char gender, boolean status) {
	super();
	ID = iD;
	this.name = name;
	this.height = height;
	this.gender = gender;
	this.status = status;
}
public int getID() {
	return ID;
}
public String getName() {
	return name;
}
public double getHeight() {
	return height;
}
public char getGender() {
	return gender;
}
public boolean isStatus() {
	return status;
}

}
