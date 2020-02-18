
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,int numBedrooms,int numBathrooms,boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup,numBedrooms,numBathrooms,laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup, numBedrooms,numBathrooms,laundryRoom
	
	public void draw() {
		System.out.println("Drawing Code for Apartment");
	}
	
	public String displayData() {		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName() +"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
		sb.append("Subgroup: "+getSubgroup() +"\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits() +"\n");
		sb.append("Average Unit Size: "+getAvgUnitSize() +"\n");
		sb.append("Number of Parking Spaces: "+isParkingAvailable() +"\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	
}
