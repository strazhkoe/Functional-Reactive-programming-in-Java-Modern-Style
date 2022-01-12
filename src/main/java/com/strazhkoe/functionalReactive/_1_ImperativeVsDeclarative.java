package com.strazhkoe.functionalReactive;

import java.util.stream.IntStream;

public class _1_ImperativeVsDeclarative {

	public static void main(String[] args) {
		int sumOfEvens = 0;
		
		//Imperative
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOfEvens +=i;
			}
		}
		
		System.out.println(sumOfEvens);
		
		//THREAD SAFE IMPLEMENTATION
		//Declarative
		sumOfEvens = IntStream.rangeClosed(1, 100)
				              .filter(i -> i % 2 == 0)
				              .sum();
		
		System.out.println(sumOfEvens);
	}
}
