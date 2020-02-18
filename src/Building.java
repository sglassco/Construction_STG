/**
 * Building class/ Parent Class for 2nd Project of CS131
 * @author Sam Glassco
 * @version 1.0
 * Building Project
 * 2/11/2020
 */
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	//initializing instance variables
	public Building() {
		projectName = "";  	
		completeAddress = ""; 	 
		totalSquareFeet = 0;	
		occupancyGroup = "";		
		subgroup = "";	   	  
	}//end empty-argument constructor
	
	//Setting the values of the instance variables based on the calling method
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}// end preferred constructor
	
	public void draw() {
		System.out.println("Drawing Code for Building");
	}//end draw
	
	//Similar to toString -> Creates string of data using the getters to retrieve the values of the given instance variables.
	public String displayData() {		
	  StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("Project Name: "+getProjectName() +"\n");
		sb.append("Complete Address: "+getCompleteAddress()+"\n");
		sb.append("Total Square Feet: "+getTotalSquareFeet() +"\n");
		sb.append("Occupancy Group: "+getOccupancyGroup() +"\n");
		sb.append("Subgroup: "+getSubgroup() +"\n");
		sb.append("==================================\n");
		return sb.toString();
		
	}//end displayData


//Getters and Setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}


	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
}//end class