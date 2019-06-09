package net.munki.play.scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		scanner.close();
		System.out.println(string);
	}

}
