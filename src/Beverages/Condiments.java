package Beverages;

// all the decorators related to the type is extended from the this class 
public abstract class Condiments extends Beverage {

	@Override
	public abstract String description() ;

	@Override
	public  abstract Double cost() ;
	

}
