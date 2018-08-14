package Homework2;

public class Computer {
	//Variables
	int generation=7;
	char model='B';
	String brand="Apple";
	//Methods
	public void memory() {
		System.out.println("256 GB");
	}
	public void specifications(int generation, char model) {
		this.generation=generation;
		this.model=model;
		System.out.println("The brand is " + brand + "\n" + "The model is " +model + "\n" + "The generation is " +generation);
	}

}
