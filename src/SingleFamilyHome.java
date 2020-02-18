
public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	public SingleFamilyHome() {
		garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,int numBedrooms,int numBathrooms,boolean laundryRoom, boolean garage) {
		super(projectName,completeAddress,totalSquareFeet,occupancyGroup,subgroup,numBedrooms,numBathrooms,laundryRoom);
		this.garage = garage;
	}
	
	public void draw() {
		System.out.println("Drawing Code for SFH");
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
			sb.append("Garage: "+isGarage() +"\n");
			sb.append("==================================\n");
			return sb.toString();
			
		}//end displayData

	//getter & setter for garage
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
}//end class

