package Beverages;
//concrete implementation of a component
public class DarkRoast extends Beverage {

	@Override
	public String description() {
		
		return "Dark Roast";
	}

	@Override
	public Double cost() {
		// this will return value as its components
		return 99.0;
	}

}
