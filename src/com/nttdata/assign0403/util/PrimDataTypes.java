package com.nttdata.assign0403.util;

public class PrimDataTypes {

	int a = 1;
	float b = 1.2F;
	double c = 1.333;
	char d = 'o';
	String e = "O is for one";
	boolean f = true;

	public void primdts() {
//using integer
		int asq = a*a;
		System.out.println(a+" to the second degress is: "+asq);
		System.out.println(Integer.MAX_VALUE);
		//using float
		float bcb = b*b*b;
		System.out.println(b+" to the third degress is: "+bcb);
		System.out.println(Float.MAX_VALUE);
		//using double
		double cq = c*c*c;
		System.out.println(c+" to the fourth degress is: "+cq);
		System.out.println(Double.MAX_VALUE);
		//using char
		char dUp = 'O';
		System.out.println("Change o to uppercase");
		//using String
		String eUP = e.toUpperCase();
		System.out.println("Change sentence to uppercase");
		//using boolean
		boolean f = false;
		System.out.println("Changed f to false");
	}
}
