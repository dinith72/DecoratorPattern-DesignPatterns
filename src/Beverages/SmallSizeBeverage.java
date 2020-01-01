package Beverages;

// concrete implementation of the decorator size classes 
public class SmallSizeBeverage extends BeverageSizes{

	Beverage beverage;
	
	public SmallSizeBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String description() {
		
		return this.beverage.description() + " in small size";
	}

	// calles the description method of the passed in wrapper object . removing wrappers layers by layer 
	//This will continue until the components cost method is called which returns value 
	// then it will add its cost component and return the final cost
	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 10.0;
	}
	

}
