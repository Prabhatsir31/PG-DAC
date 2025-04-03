/*
abstract class Beverages {
	// Defined
		public void addMilk() { }
	// abstract
	abstract void addIngredients();
}

class Coffee extends Beverages {
	void addIngredients() { // ingredients for Coffee }
	// addMilk inherited
}
class Tea extends Beverages {
	void addIngredients() { // ingredients for Tea }
	// addMilk inherited
}
class FruitJuice extends Beverages {
	void addIngredients() { // ingredients for FruitJuice }
	// addMilk inherited
}
create Array of Beverages class and store all the child classes objects.
now traverse the array and invoke all the functions.
*/
package Abtrac;

abstract class Beverages {
	public void addMilk() {
		System.out.println("Adding Milk...");
	}
	// Abstract Method
	abstract void addIngredients();
}

class Coffee extends Beverages {
	@Override
	void addIngredients() {
		System.out.println("Adding coffee grounds and sugar.");
	}
}

class Tea extends Beverages {
    @Override
    void addIngredients() {
        System.out.println("Adding tea leaves and lemon.");
    }
}

class FruitJuice extends Beverages {
    @Override
    void addIngredients() {
        System.out.println("Adding fresh fruits and sugar.");
    }
}

public class Ques2 {
	public static void main(String args[]) {
		Beverages[] beverages = new Beverages[3];
		
		beverages[0] = new Coffee();
		beverages[1] = new Tea();
		beverages[2] = new FruitJuice();
		
		for (Beverages beverage : beverages) {
			beverage.addMilk();
			beverage.addIngredients();
			System.out.println();
		}
	}
}
