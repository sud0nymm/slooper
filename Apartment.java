package lab5;

public class Apartment extends Building implements CityProperty{

	private double monthlyFee;
	private int bedrooms;
	
	public Apartment(String arg1, double arg2, int arg3, double arg4, int arg5) {
		
		super(arg1,arg2,arg3);{
		
			monthlyFee = arg4;
			bedrooms = arg5;
		}
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	public double computePropertyTax() {
		return((10*squaremeters) + (50*bedrooms));
	}
	
	public double maintenance() {
		return monthlyFee;
	}
}
