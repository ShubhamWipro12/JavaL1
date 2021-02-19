package com.wipro.topic2.music.wind;

import com.wipro.topic2.music.Playable;

public class Saxophone implements Playable {

	@Override
	public void play() {
		System.out.println("Playing Saxophone.");
	}

}
