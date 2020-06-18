package is_retake;

public class Test {

	public static void main(String[] args) {
		
		EmployeeRegister employeeRegister = new EmployeeRegister();
		DepartmentRegister departmentRegister = new DepartmentRegister();
		ProjectRegister projectRegister = new ProjectRegister();
		
		Employee e1 = new Employee("Helene", 45000);
		Employee e2 = new Employee("Joakim", 40000);
		
		
		employeeRegister.addEmployee(e1);
		employeeRegister.addEmployee(e2);

		
		Main_Frame mainFrame = new Main_Frame(new Controller(employeeRegister, departmentRegister,projectRegister));
		mainFrame.setVisible(true);
	}

}

