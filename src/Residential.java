
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress,  totalSquareFeet,  occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}

	public void draw() {
		System.out.println("Drawing Code for Residential");
	}
	
	public String displayData() {		
		  StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("Project Name: "+getProjectName() +"\n");
			sb.append("Complete Address: "+getCompleteAddress()+"\n");
			sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
			sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
			sb.append("Subgroup: "+getSubgroup() +"\n");
			sb.append("Number of Bedrooms: "+getNumBedrooms() +"\n");
			sb.append("Number of Bathrooms: "+getNumBathrooms() +"\n");
			sb.append("Laundry Room: "+isLaundryRoom() +"\n");
			sb.append("==================================\n");
			return sb.toString();
			
		}//end displayData
	
	//getters/setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	
	
}//end class
