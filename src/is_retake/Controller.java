package is_retake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	EmployeeWindow employeeWindow;
	EmployeeRegister employeeRegister;
	DepartmentRegister departmentRegister;
	ProjectRegister projectRegister;
	
	Frametest framtest = new Frametest(this);
	EmployeeFrame employeeFrame = new EmployeeFrame(this);


	public Controller() {
		
		this.employeeRegister = new EmployeeRegister();
		this.departmentRegister = new DepartmentRegister();
		this.projectRegister = new ProjectRegister();		
		//Comment
	}

	public Controller(EmployeeRegister employeeRegister, DepartmentRegister departmentRegister,
			ProjectRegister projectRegister) {

		this.employeeRegister = employeeRegister;
		this.departmentRegister = departmentRegister;
		this.projectRegister = projectRegister;
	}
	
	public void testFrame(){	
				employeeFrame.setVisible(false);
				framtest.setVisible(true);
			}
		
		
	}


