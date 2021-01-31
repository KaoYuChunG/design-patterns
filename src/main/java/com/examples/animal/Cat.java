package com.examples.animal;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println("pp");
	}

	@Override
	public void eat() {
		System.out.println("pp");
	}

	@Override
	public void mating(Animal animal) {
		System.out.println("pp");
	}

	public void scratch(){
		System.out.println("rsrs");
	}
}
