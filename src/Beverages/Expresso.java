package Beverages;

// concrete implementation of a component
public class Expresso extends Beverage {

	@Override
	public String description() {
		
		return "Expresso";
	}

	@Override
	public Double cost() {
		// this will return value as its components
		return 199.0;
	}

}
