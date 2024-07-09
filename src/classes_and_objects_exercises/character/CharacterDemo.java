package classes_and_objects_exercises.character;

import java.util.Scanner;

public class CharacterDemo {

	public static void main(String[] args) {
		Character character = new Character(100, 1000, 20);
		Scanner in = new Scanner(System.in);

		System.out.println();
		character.characterInfo();

		System.out.println("Welcome to the shop, choose an item to buy:\n" + "press 1 for tomato - costs 5 cash\n"
				+ "press 2 for a gram of " + "gold - costs 500 cash\n" + "press 3 for a sword - costs 100 " + "cash");
		String choice = in.next();

		while (!choice.matches("[123]")) {
			System.out.print("This slot isn't existant, try again ");
			choice = in.next();
		}

		int price = 0;
		while (character.cash_sum >= 100) {
			switch (choice) {
			case "1":
				price += 5;
				character.cash_sum = character.toPurchase(price);
				System.out.println("Your cash is " + character.cash_sum);
				System.out
						.println("Do you want to buy something else? if yes press - 1, 2 or 3\n"
								+ " otherwise - type No");
				choice = in.next();
				break;
			case "2":
				price += 500;
				System.out.println("Your cash is " + character.cash_sum);
				System.out.println(
						"Do you want to buy something else? if yes press - 1, 2 or 3\n"
				+ " otherwise - type No");
				choice = in.next();
				character.cash_sum = character.toPurchase(price);
				break;
			case "3":
				price += 100;
				character.cash_sum = character.toPurchase(price);
				System.out.println("Your cash is " + character.cash_sum);
				System.out.println(
						"Do you want to buy something else?\n"
				+ "If no - type No");
				choice = in.next();
				break;
			default:
				System.out.println("Thanks for your visit\n we hope to" + "see you soon.");
			}
			// faulty code should be repaired later
		}
	}

}
