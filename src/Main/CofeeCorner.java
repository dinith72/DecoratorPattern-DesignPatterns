package Main;
import Beverages.*;

public class CofeeCorner {

	public static void main(String[] args) {
		
		// creates the main cofee types dark roast and expresso
		Beverage darkRoast = new DarkRoast();
		Beverage expresso = new Expresso();
		
		// add milk decorater for the dark roast 
		Beverage darkRoastWithMilk = new Milk(darkRoast);
		
		
		// add the wrapper small sized beverage 
		Beverage beverageSmall = new SmallSizeBeverage(darkRoastWithMilk);
		
		
		// add the wrapper large size beverage
		Beverage beverageLarge = new LargeSizedBeverage(darkRoastWithMilk);
		
		
		System.out.println(darkRoastWithMilk.description() + " cost: " + darkRoastWithMilk.cost());
		
		
		System.out.println(beverageSmall.description() + " cost: " + beverageSmall.cost());
		System.out.println(beverageLarge.description() + " cost : " + beverageLarge.cost());
	}

}
