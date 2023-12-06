package lab5;

public class Lab5 {

	public static void main(String[] args) {
		
		System.out.println("Diagnostics for buildings");
		Cottage myCottage = new Cottage("Vildmarkvägen 1", 850000.0, 100, 100.0);
		System.out.println(myCottage);
		Apartment myApartment = new Apartment("Kungsgatan 7", 2500000.0, 115, 6400.0, 3);
		System.out.println(myApartment);
		Villa myVilla = new Villa("Villavägen 13", 6700000.0, 180, 2000.0, 1500.0, 4);
		System.out.println(myVilla);
		
		System.out.println("for the estate agent");
		EstateAgent theEstateAgent = new EstateAgent("Watson Property");
		theEstateAgent.addBuilding(myApartment); 
		theEstateAgent.addBuilding(myVilla); theEstateAgent.addBuilding(myCottage);
		theEstateAgent.addBuilding(new Apartment("Ektorpgatan 28", 2000000.0, 92, 5300.0, 3)); 
		theEstateAgent.addBuilding(new Apartment("Hagavägen", 1600000.0, 62, 4500.0, 1)); 
		theEstateAgent.addBuilding(new Villa("Kneippgatan 3", 7900000.0, 210, 1800.0, 1800.0,5)); 
		theEstateAgent.addBuilding(new Villa("Vätterngatan 18", 9000000.0, 190, 1200.0, 1900.0,7));
		theEstateAgent.addBuilding(new Cottage("Rydgatan 4", 500000.0, 80, 200)); 
		theEstateAgent.addBuilding(new Cottage("Sjövägen 22", 620000.0, 70, 400)); 
		theEstateAgent.addBuilding(new Cottage("Lindövägen 18", 950000.0,80,200.0));
		System.out.println(theEstateAgent);
		
		System.out.println("all buildings");
		System.out.println(theEstateAgent.sort(EstateAgent.ALLBUILDINGS));
		System.out.println(theEstateAgent);
		
		System.out.println("Sorting cottages");
		System.out.println(theEstateAgent.sort(EstateAgent.COTTAGES));
		System.out.println(theEstateAgent);
		
		System.out.println("Sorting city buildings");
		System.out.println(theEstateAgent.sort(EstateAgent.CITYBUILDINGS));
		System.out.println(theEstateAgent);
		
	}

}
