package is_retake;


public class Employee {
	
	private String employeeID;
	private String name;
	private double salary;
	private Project project; 
	private int counter = 23000; //Funkar detta eller ska det till controller/register

	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String generateEmployeeID() {
		String iD = "E"+Integer.toString(counter++);
		return iD;
	}
	
	public void editEmployeeName(Employee employee, String name) {
		employee.setName(name);
	}
	
	public void editEmployeeSalary(Employee employee, double salary) {
		employee.setSalary(salary);
	}
	
	public void editEmployeeProject(Employee employee, Project project) {
		employee.setProject(project);
	}

}
