
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup,numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}
	
	public void draw() {
		System.out.println("Drawing Code for Mall");
	}
	
	public String displayData() {		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName() +"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
		sb.append("Subgroup: "+getSubgroup() +"\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits() +"\n");
		sb.append("Number of Rented Units: "+getNumRentedUnits() +"\n");
		sb.append("Median Unit Size: "+getMedianUnitSize() +"\n");
		sb.append("Number of Parking Spaces: "+getNumParkingSpaces() +"\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData

	
	//getters&setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	
}//end class
