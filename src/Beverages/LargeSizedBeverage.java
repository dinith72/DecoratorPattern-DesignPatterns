package Beverages;

// concrete implementation of the decorator size class
public class LargeSizedBeverage extends BeverageSizes{

	Beverage beverage;
	
	public LargeSizedBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	// accepts any beverage object: so it can be comcrete component or  a concrete component wrapped with decorator(s)
		// and assign to its varible 
	@Override
	public String description() {
		
		return this.beverage.description()  + " in large size";
	}

	// calles the description method of the passed in wrapper object . removing wrappers layers by layer 
	//This will continue until the components cost method is called which returns value 
	// then it will add its cost component and return the final cost
	@Override
	public Double cost() {
		
		return this.beverage.cost() + 20.0;
	}
	

}
