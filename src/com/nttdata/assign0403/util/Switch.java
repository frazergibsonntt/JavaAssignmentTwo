package com.nttdata.assign0403.util;

public class Switch {
	public void switchmethod(int a) {
		int key = a;
		switch (key) {
		case 1:
			System.out.println("Uno!");
			break;

		case 2:
			System.out.println("Dos!");
			break;
			
		case 3:
			System.out.println("Tres!");
			break;
			
		default:
			System.out.println("Invalid entry!");
			break;
		}
	}
}
