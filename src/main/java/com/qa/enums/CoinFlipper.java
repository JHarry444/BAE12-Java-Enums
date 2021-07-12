package com.qa.enums;

import java.util.Random;

public class CoinFlipper {

//	public void call(String call) {
//
//	}
	private Random rand = new Random();

	public CoinFlip call(CoinFlip call) {
		int rng = rand.nextInt(101); // random number 0->100

		CoinFlip result = null;
		if (rng < 50) {
			result = CoinFlip.HEADS;
		} else if (rng < 100) {
			result = CoinFlip.TAILS;
		} else {
			result = CoinFlip.EDGE;
		}

		System.out.println("You called " + call + " and the result was " + result);
		if (call == result) {
			System.out.println("You won!");
		} else {
			System.out.println("Too bad!");
		}

		return result;
	}

}
