package com.wipro.topic2;

abstract class Instrument {
	abstract String play();
}

class Piano extends Instrument {

	@Override
	String play() {
		return "Piano is playing tan tan tan tan";
	}

}

class Flute extends Instrument {

	@Override
	String play() {
		return "Flute is playing toot toot toot toot";
	}

}

class Guitar extends Instrument {

	@Override
	String play() {
		return "Guitar is playing tin tin tin";
	}

}

public class Assignment5 {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];

		for (int i = 0, j = 0; i < instruments.length; i++, j++) {

			if (j == 3)
				j = 0;

			if (j == 0)
				instruments[i] = new Flute();

			if (j == 1)
				instruments[i] = new Guitar();

			if (j == 2)
				instruments[i] = new Piano();
		}

		for (int i = 0; i < instruments.length; i++) {

			// checking polymorphic behaviour
			System.out.println(instruments[i].play());

			if (instruments[i] instanceof Flute)
				System.out.println("Is a instance of Flute");
			else if (instruments[i] instanceof Guitar)
				System.out.println("Is a instance of Guitar");
			else if (instruments[i] instanceof Piano)
				System.out.println("Is a instance of Piano");
		}
	}
}
