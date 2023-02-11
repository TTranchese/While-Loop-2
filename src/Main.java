import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command;
		do {
			System.out.println("Please enter a command: ");
			command = sc.nextLine();
			System.out.println("The command you entered is: " + command);
		} while (!command.equals("stop"));
		System.out.println("Terminating program");
	}
}