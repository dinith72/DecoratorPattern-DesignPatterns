package Beverages;


// a concrete implementation of the decorator
public class Milk extends Condiments{

	
	Beverage beverage;
	
	// accepts any beverage object: so it can be comcrete component or  a concrete component wrapped with decorator(s)
	// and assign to its varible 
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String description() {
		// similar to the cost function 
		return beverage.description() + "with Milk";
	}

	@Override
	public Double cost() {
		// calles the cost method of the passed in ( argument )  object and start removing wrapper objects  layers by layer 
		//This will continue until the components cost method is called which returns value 
		// then each of the wrapper  will add its cost ( its own modification ) to return value and return the final cost
		return beverage.cost() + 10 ;
	}
	

}
