package Strings;

import java.util.Scanner;

public class userInput {
	public static void input(String input) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name!!");
		input = sc.nextLine();
		System.out.println("Name entered by user is:"+input);
	}

	public static void main(String[] args) {
		String str =" ";
		input(str);

	}

}
