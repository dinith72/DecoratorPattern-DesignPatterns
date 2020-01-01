package Beverages;

public class Milk extends Condiments{

	
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String description() {
		
		return beverage.description() + "with Milk";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 10 ;
	}
	

}
