package Main;
import Beverages.*;

public class CofeeCorner {

	public static void main(String[] args) {
		
		// creates the main cofee types dark roast and expresso
		Beverage darkRoast = new DarkRoast();
		Beverage expresso = new Expresso();
		
		// add milk decorater for the dark roast 
		Beverage darkRoastWithMilk = new Milk(darkRoast);
		
		// add mocha decorator for dark roast 
		Beverage darkRoastWithMocha = new Mocha(darkRoast);
		
		// add milk decorator for expresso
		Beverage expressoWithMilk = new Milk(expresso);
		
		// wrap the expresso twice with mocha decorator
		Beverage expressoWithMocca = new Mocha(expresso);
		expressoWithMocca = new Mocha(expressoWithMocca);
		
		System.out.println(darkRoastWithMilk.description() + " cost: " + darkRoastWithMilk.cost());
		
		System.out.println(darkRoastWithMocha.description() + " cost: " + darkRoastWithMocha.cost());
		
		
		System.out.println(expressoWithMilk.description() + " cost "  + expressoWithMilk.cost());
		System.out.println(expressoWithMocca.description() + " cost " + expressoWithMocca.cost());
	}

}
