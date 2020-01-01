package Beverages;

public class Mocha extends Condiments{
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String description() {
		return this.beverage.description() + "with Mocha";
	}

	@Override
	public Double cost() {
		
		return this.beverage.cost() + 20;
	}
	

}
