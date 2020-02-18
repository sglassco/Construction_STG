
public class Business extends Building{
	protected int numRentableUnits;
	
	public Business() {
		numRentableUnits = 0;
	}
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress,  totalSquareFeet,  occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}
	
	public void draw() {
		System.out.println("Drawing Code for Business");
	}
	
	public String displayData() {		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName() +"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
		sb.append("Subgroup: "+getSubgroup() +"\n");
		sb.append("Number of Rentable Units: "+getNumRentableUnits() +"\n");
		sb.append("==================================\n");
		return sb.toString();
	}//end displayData
	
	//getter/setter
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
}
