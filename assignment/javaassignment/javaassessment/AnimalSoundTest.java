package com.tyss.javaassessment;

/*1)WAP to print sound of an animal based on the object received by the method.*/
public class AnimalSoundTest {

	public static void main(String[] args) {
		Animal a;
		Cat c = new Cat();
		Dog d = new Dog();
		AnimalSound s = new AnimalSound();
		// passing object of Cat class
		s.getSound(c);
		// passing object of Dog class
		s.getSound(d);

	}

}
