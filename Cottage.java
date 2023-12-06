package lab5;

public class Cottage extends Building {

	private double electricity;
	
	public Cottage(String arg1, double arg2, int arg3, double arg4) {
		super(arg1,arg2,arg3);
		electricity = arg4;
	}
	
	public double maintenance() {
		return electricity;
	}
	
	
}
