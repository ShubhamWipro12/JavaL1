package com.wipro.topic5;

import com.wipro.topic5.automobile.twoWheeler.Hero;
import com.wipro.topic5.automobile.twoWheeler.Honda;

public class Assignment3 {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		System.out.println(hero.modelName());
		System.out.println(hero.registrationNumber());
		System.out.println(hero.ownerName());
		System.out.println(hero.speed());
		hero.radio();
		
		
		Honda honda = new Honda();
		System.out.println(honda.modelName());
		System.out.println(honda.registrationNumber());
		System.out.println(honda.ownerName());
		System.out.println(honda.speed());
		System.out.println(honda.cdplayer());
		
		
		
	}

}
