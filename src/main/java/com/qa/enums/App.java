package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate.of(1994, Month.APRIL, 4);

		CoinFlipper flipper = new CoinFlipper();

		flipper.call(CoinFlip.HEADS);

	}

}
