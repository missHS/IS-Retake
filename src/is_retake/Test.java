package is_retake;

public class Test {

	public static void main(String[] args) {
		
		EmployeeRegister employeeRegister = new EmployeeRegister();
		DepartmentRegister departmentRegister = new DepartmentRegister();
		ProjectRegister projectRegister = new ProjectRegister();
		
		Employee e1 = new Employee();
		e1.setName("Helene");
		e1.setEmployeeID(employeeRegister.generateEmployeeID());
		Employee e2 = new Employee();
		e2.setName("Joakim");
		e2.setEmployeeID(employeeRegister.generateEmployeeID());
		
		employeeRegister.addEmployee(e1);
		employeeRegister.addEmployee(e2);
		
	
		
		System.out.println(e1.getEmployeeID());
		System.out.println(e2.getEmployeeID());
		
		EmployeeFrame employeeFrame = new EmployeeFrame(new Controller(employeeRegister, departmentRegister,projectRegister));
		employeeFrame.setVisible(true);
	}

}

