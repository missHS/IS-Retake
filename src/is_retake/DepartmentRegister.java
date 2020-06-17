package is_retake;

import java.util.HashMap;
import java.util.Map;

public class DepartmentRegister {

	private Map<String, Department> departmentList = new HashMap<String, Department>();

	public Map<String, Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(Map<String, Department> departmentList) {
		this.departmentList = departmentList;
	}

	public void addDepartment(String name, Department department) {
		departmentList.put(name, department);
	}

	public void removeDepartment(Department department) {
		departmentList.remove(department.getName());
	}
	
	public Department findDepartment(String departmentID) {
		return departmentList.get(departmentID);
	}
	
	public void editDepartmentName(Department department, String name) {
		department.setName(name);
	}
	
	public void editDepartmentBudget(Department department, double budget) {
		department.setBudget(budget);
	}

}
