package com.bridgelabz.linecomparision;

import java.util.Scanner;

/* start display*/

public class Linecomparision {
	/* measuring length of line 1 and line 2  and comparing they are equal or not */

	public static void linecompare() {
		Scanner num = new Scanner(System.in);
		System.out.println("enter value of x1:");
		int x1 = num.nextInt();
		System.out.println("enter value of x2:");
		int x2 = num.nextInt();
		System.out.println("enter value of y1:");
		int y1 = num.nextInt();
		System.out.println("enter value of y2:");
		int y2 = num.nextInt();
		System.out.println("enter value of x3 :");
		int x3 = num.nextInt();
		System.out.println("enter value of x4:");
		int x4 = num.nextInt();
		System.out.println("enter value of y3:");
		int y3 = num.nextInt();
		System.out.println("enter value of y4:");
		int y4 = num.nextInt();
		double z1 = Math.floor(Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2));
		System.out.println("length of line 1=" + z1);
		double z2 = Math.floor(Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2));
		System.out.println("length of line 2 = " + z2);

		/* lines are equal or not */
		if (z1 == z2) {
			System.out.println("length of both lines are equal");
		} else {
			System.out.println("length of both lines are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n" + "Comparison Computation\r\n" + "Program on Master Branch");
		;
		Linecomparision.linecompare();
	}

}