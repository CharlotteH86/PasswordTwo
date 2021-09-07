package pack;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);

		String password = "abc123";

		int attempts = 0;

		System.out.println("Enter password: ");

		String inputPassword;

		while (true) {
			inputPassword = text.nextLine();

			if (inputPassword.equals(password)) {
				System.out.println("Right Password!");
				break;

			} else if (inputPassword != password && attempts < 2) {

				System.out.println("Wrong try again");

			}
			attempts++;
			if (attempts == 3) {
				System.out.println("Account locked");
				break;

			}

		}
	}

}
