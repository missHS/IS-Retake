package is_retake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	EmployeeWindow employeeWindow;
	EmployeeRegister employeeRegister;
	DepartmentRegister departmentRegister;
	ProjectRegister projectRegister;
	
	ProjectFrame projectFrame = new ProjectFrame(this);
	Main_Frame mainFrame = new Main_Frame(this);
	OrganizationFrame organisationFrame = new OrganizationFrame(this);

	public Controller() {
		
		this.employeeRegister = new EmployeeRegister();
		this.departmentRegister = new DepartmentRegister();
		this.projectRegister = new ProjectRegister();		
		
	}

	public Controller(EmployeeRegister employeeRegister, DepartmentRegister departmentRegister,
			ProjectRegister projectRegister) {

		this.employeeRegister = employeeRegister;
		this.departmentRegister = departmentRegister;
		this.projectRegister = projectRegister;
	}
	
	public void testFrame(){	
				mainFrame.setVisible(false);
				fest.setVisible(true);
			}
		
		
	}


