package Beverages;

public class SmallSizeBeverage extends BeverageSizes{

	Beverage beverage;
	
	public SmallSizeBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String description() {
		
		return this.beverage.description() + " in small size";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 10.0;
	}
	

}
