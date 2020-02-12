package com.njb.annotations;



public class TestAnnotation1 {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.eatSomething();
		// with-out @Override >>  eating food
		// with @Override >>
		
		
		Animal b = new Animal();
		b.eatSomething();

	}
}


class Animal{	
	void eatSomething() {
		System.out.println("eating something");
	}
}

class Dog extends Animal{
	
	@Override
	void eatSomething() {
		System.out.println("eating food");
	}
}
