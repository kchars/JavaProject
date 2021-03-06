package hr;

public class Department {
	private int departmentID;
	private String departmentName;
	private int managerID;
	private int locationID;
	
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentId(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerID() {
		return managerID;
	}
	public void setManagerId(int managerID) {
		this.managerID = managerID;
	}
	public int getLocationID() {
		return locationID;
	}
	public void setLocationId(int locationID) {
		this.locationID = locationID;
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + ", managerID="
				+ managerID + ", locationID=" + locationID + "]";
	}
	
}
