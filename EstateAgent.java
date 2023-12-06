package lab5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EstateAgent {

	public final static int ALLBUILDINGS = 1, CITYBUILDINGS = 2, COTTAGES = 3;
	public final String NAME;
	private ArrayList<Building> theBuildings = new ArrayList<Building>();
	private ArrayList<Cottage> theCottages = new ArrayList<Cottage>();;
	private ArrayList<CityProperty> theCityBuildings = new ArrayList<CityProperty>();
	
	public EstateAgent(String arg1) {
		NAME = arg1;
	}
	
	public String addBuilding(Building arg) {
		
		String returner = "something went wrong";
		if (arg instanceof Cottage) {
			theBuildings.add((Building)arg);
			theCottages.add((Cottage) arg);
			returner = "Added Cottage";
		}
		else if(arg instanceof CityProperty) {
			theBuildings.add((Building)arg);
			theCityBuildings.add((CityProperty) arg);
			returner = "Added City Building";
		}
		return returner;
	}
	
	public String sort(int arg) {
		
		System.out.println("Sorting by price (1) or by area(2)?\n");
		Scanner s = new Scanner(System.in);
		String select = s.next();
		
		String returner = "Not sorted\n";	
		
		if (Integer.parseInt(select) == 1 || Integer.parseInt(select) == 2) {
			Building.selection = Integer.parseInt(select);
			if (Integer.parseInt(select) == 1) {
				returner = "Sorted by price";
			}
			if (Integer.parseInt(select) == 2) {
				returner = "Sorted by area";
				
			}
		}
		
		//sorting with bubblesort
		if (arg == ALLBUILDINGS) {
			Boolean swapped;
			for (int i = 0; i < theBuildings.size(); i++) {
				swapped = false;
				for (int j = 0; j < theBuildings.size()-i-1; j++) {
					if(theBuildings.get(j).compareTo(theBuildings.get(j+1))>0) {
						Building temp1 = theBuildings.get(j);
						theBuildings.set(j, theBuildings.get(j+1));
						theBuildings.set(j + 1, temp1);
						swapped = true;
					}
				}
				if (!swapped) {
					break;
				}
			}
			updateLists();
		}
		
		//sorting with sort function
		if (arg == CITYBUILDINGS) {
			ArrayList<Building> sortedCity = new ArrayList<Building>();
			
			for (int i = 0; i < theCityBuildings.size(); i++) {
				sortedCity.add((Building) theCityBuildings.get(i));
			}
			
			Collections.sort(sortedCity);
			for (int i = 0; i < theCityBuildings.size(); i++) {
				sortedCity.add((Building) theCityBuildings.get(i));
			}
			
			updateLists(CITYBUILDINGS);
		}
		
		if (arg == COTTAGES) {
			ArrayList<Building> sortedCity = new ArrayList<Building>();
			
			for (int i = 0; i < theCottages.size(); i++) {
				sortedCity.add((Building) theCottages.get(i));
			}
			
			Collections.sort(sortedCity);
			for (int i = 0; i < theCottages.size(); i++) {
				sortedCity.add((Building) theCottages.get(i));
			}
			
			updateLists(COTTAGES);
		}
		
		return returner;
	}
	
	public void updateLists() {
		for (int i = 0; i < theBuildings.size(); i++) {
			if (theBuildings.get(i) instanceof Cottage) {
				for (int j = 0; j < theCottages.size(); j++){
					theCottages.set(j,(Cottage) theBuildings.get(i));
				}	
			}
			if (theBuildings.get(i) instanceof CityProperty) {
				for (int j = 0; j < theCityBuildings.size(); j++){
					theCityBuildings.set(j,(CityProperty) theBuildings.get(i));
				}		
			}
		}
	}
	
	public void updateLists(int arg) {
		
		if (arg == COTTAGES) {
			for (int i = 0; i < theBuildings.size(); i++) {
				if (theBuildings.get(i) instanceof Cottage) {
					for (int j = 0; j < theCottages.size(); j++){
						theCottages.set(j,(Cottage) theBuildings.get(i));
					}	
				}
			}
		}else if (arg == CITYBUILDINGS) {
			for (int i = 0; i < theBuildings.size(); i++) {
				if (theBuildings.get(i) instanceof CityProperty) {
					for (int j = 0; j < theCityBuildings.size(); j++){
						theCityBuildings.set(j,(CityProperty) theBuildings.get(i));
					}		
				}
			}
		} else {
			;
		}
	}
	
	public String toString() {
		String string = "Estate Agent: " + NAME + "\n" + "All Buildings :\n";
		for (Building build : theBuildings) {
			string += build + "\n";
		}
		string += "\nCottages:\n";
		for (Cottage cott : theCottages) {
			string += cott + "\n";
		}
		string += "\nVillas and Apartments:\n";
		for (CityProperty citProp : theCityBuildings) {
			string += citProp + "\n";
		}
		

		return string;
	}
	
	
	
}





