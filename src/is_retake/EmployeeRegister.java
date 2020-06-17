package is_retake;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegister {

	private Map<String, Employee> employeeList = new HashMap<String, Employee>();
	

	public Map<String, Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Map<String, Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void addEmployee(Employee employee) {
		employeeList.put(employee.getEmployeeID(), employee);
	}

	public void removeEmployee(Employee employee) {
		employeeList.remove(employee.getEmployeeID());
	}

	public Employee findEmployee(String employeeID) {
		return employeeList.get(employeeID);
	}


}
