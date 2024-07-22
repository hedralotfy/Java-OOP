package inheritanceAndPolyExercise.presents;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Present {

	List<Sweet> list = new LinkedList<Sweet>();
	
	Sweet []aSweet;
	int counter = 0;
	Sweet[] filteredSweets;

	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		int sweetCount = 0;

		aSweet = getSweets();
		for (Sweet sweet : aSweet) {
			
			if (minSugarWeight <= sweet.sugarWeight && maxSugarWeight >= sweet.sugarWeight) {
				sweetCount++;
			}
		}

		filteredSweets = new Sweet[sweetCount];

		for (int i = 0, j = 0; i < aSweet.length; i++) {
			if (minSugarWeight <= aSweet[i].sugarWeight && maxSugarWeight >= aSweet[i].sugarWeight) {
				filteredSweets[j] = aSweet[i];
				j++;
			}

		}
		
		for(int i =0; i< filteredSweets.length; i++) {
			if(filteredSweets[i] == null) {
				filteredSweets = new Sweet[0];
				break;
			}
		}
		return filteredSweets;
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {

		double totalWeight = 0;
		for (int i = 0; i < filteredSweets.length; i++) {
			totalWeight += filteredSweets[i].getTotalWeight();
		}

		return totalWeight;
	}

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		list.add(sweet);

	}

	// the method returns copy of the Sweet[] array so that nobody could
	// modify state of the present without addSweet() method.
	// Also array shouldn’t contain null values.

	public Sweet[] getSweets() {

		int sweetCounter = 0;

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != null) {
				sweetCounter++;
			}	
		}
		
		Sweet[] sweets = new Sweet[sweetCounter];
		
		for(int i = 0, j = 0; i < list.size(); i++) {
			if(list.get(i) != null) { 
				sweets[j] =  list.get(i);
				j++;
			}
		}

		return sweets;
	}

}
