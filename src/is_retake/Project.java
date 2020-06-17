package is_retake;

import java.util.HashMap;
import java.util.Map;

public class Project {
	private String projectID;
	private String name;
	private double budget;
	private Map<String, Employee> employeeListForProject = new HashMap<String, Employee>();
	
	public Project(String projectID, String name, double budget) {
		this.projectID = projectID;
		this.name = name;
		this.budget = budget;
		//Does the map need to be initierad??
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Map<String, Employee> getEmployeeListForProject() {
		return employeeListForProject;
	}
	public void setEmployeeListForProject(Map<String, Employee> employeeListForProject) {
		this.employeeListForProject = employeeListForProject;
	}
	
	public void addEmployeeToProject(Employee employee) {
		employeeListForProject.put(employee.getEmployeeID(), employee);
	}
	
	public void removeEmployeeFromProject(Employee employee) {
		employeeListForProject.remove(employee.getEmployeeID());
	}
	
	public Employee findEmployeeInProject(String employeeID) {
		return employeeListForProject.get(employeeID);
	}

}
