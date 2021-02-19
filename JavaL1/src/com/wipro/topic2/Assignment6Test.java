package com.wipro.topic2;

import com.wipro.topic2.music.Playable;
import com.wipro.topic2.music.string.Veena;
import com.wipro.topic2.music.wind.Saxophone;

public class Assignment6Test {

	public static void main(String[] args) {
		Veena veena = new Veena();
		veena.play();
		
		Saxophone saxophone = new Saxophone();
		saxophone.play();
		
		
		Playable veena2 = new Veena();
		veena2.play();
		
		Playable saxophone2 = new Saxophone();
		saxophone2.play();
		
		
	}

}
