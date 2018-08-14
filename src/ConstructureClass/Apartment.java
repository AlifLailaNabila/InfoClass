package ConstructureClass;

public class Apartment {
String houseName="hhh";
int houseAddress=0;

public Apartment() {
}
public Apartment(String houseName) {
	this.houseName=houseName;
	System.out.println(houseName);
}
public Apartment(String houseName, int houseAddress) {
	this.houseAddress=houseAddress;
	this.houseName=houseName;
	System.out.println(houseName+ " " + houseAddress);
}
public void displayHouseName() {
	System.out.println(houseName);
}
}
