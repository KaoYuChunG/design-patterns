package com.examples.animal;

public class Main {
	public static void main(String[] argv){
		Animal[] animals = new Animal[]{ new Cat("Gustavo"), new Dog("Mario") };
//		Cat cat = new Cat("ha");
//		cat.scratch();
//		Cat[] cats = new Cat[]{new Cat("John")};
//		for (Animal animal : cats)
//		{
//			System.out.print(animal.getName() + ":");
//			animal.talk();
//		}
		for (Animal animal : animals)
		{
			System.out.print(animal.getName() + ":");
			animal.talk();
		}

	}
}
