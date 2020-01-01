package Beverages;
//a concrete implementation of the decorator
public class Mocha extends Condiments{
	Beverage beverage;
	
	// accepts any beverage object: so it can be comcrete component or  a concrete component wrapped with decorator(s)
		// and assign to its variable 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String description() {
		return this.beverage.description() + "with Mocha";
	}

	@Override
	public Double cost() {
		// calles the cost method of the passed in ( argument )  object and start removing wrapper objects  layers by layer 
				//This will continue until the components description method is called which returns value 
				// then it will add its cost component and return the final cost
		
		return this.beverage.cost() + 20;
	}
	

}
