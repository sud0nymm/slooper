package lab5;

public abstract class Building implements Comparable <Building>{

	private String address;
	private double price;
	protected int squaremeters;
	protected static int selection;
	
	public Building(String arg1, double arg2, int arg3) {
		
		address = arg1;
		price = arg2;
		squaremeters = arg3;
	}
	
	public abstract double maintenance();
	
	public int compareTo(Building arg) {
		
		int returnint = 0;
		
		if (selection == 1) {
			if (price > arg.price) {
				returnint = 1;
			}
			else if (price < arg.price) {
				returnint = -1;
			}
		}
		else if (selection == 2) {
			if (squaremeters > arg.squaremeters){
				returnint = 1;
			} 
			else if (squaremeters < arg.squaremeters) {
				returnint = -1;
			}
		}
		
		return returnint;
	}
	
	public String toString() {

		if (this instanceof CityProperty) {
			return String.format("Address:  %-16s, Living Area:  %4d, Price:  %-10.1f, Maintenance:  %-7.1f, Property Tax:  %-4.1f", address, squaremeters, price, maintenance(), ((CityProperty) this).computePropertyTax());
		}
		else return String.format("Address:  %-16s, Living Area:  %4d, Price:  %-10.1f, Maintenance:  %-7.1f", address, squaremeters, price, maintenance());
	}
	
}




