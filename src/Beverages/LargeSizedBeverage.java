package Beverages;

public class LargeSizedBeverage extends BeverageSizes{

	Beverage beverage;
	
	public LargeSizedBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String description() {
		
		return this.beverage.description()  + " in large size";
	}

	@Override
	public Double cost() {
		
		return this.beverage.cost() + 20.0;
	}
	

}
