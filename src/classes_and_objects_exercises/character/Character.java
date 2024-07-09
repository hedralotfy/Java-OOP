package classes_and_objects_exercises.character;

public class Character {

	int health_bar;
	int cash_sum;
	int rare_coins;

	Character(int health_bar, int cash_sum, int rare_coins) {
		this.health_bar = health_bar;
		this.cash_sum = cash_sum;
		this.rare_coins = rare_coins;
	}

	void characterInfo() {
		System.out.println("Character's health " + health_bar + ", cash in the wallet is " + cash_sum
				+ ", rare coins are " + rare_coins);
	}
	
	int toPurchase(int price){
		int totalCash = this.cash_sum - price;
		return totalCash;
	}

}
