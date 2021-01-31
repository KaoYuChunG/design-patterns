package com.examples.animal;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println("LL");
	}

	@Override
	public void eat() {
		System.out.println("LL");
	}

	@Override
	public void mating(Animal animal) {
		System.out.println("LL");
	}

}
