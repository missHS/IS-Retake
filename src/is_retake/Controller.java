package is_retake;


public class Controller {

	EmployeeWindow employeeWindow;
	EmployeeRegister employeeRegister;
	DepartmentRegister departmentRegister;
	ProjectRegister projectRegister;
	
	ProjectFrame projectFrame = new ProjectFrame(this);
	Main_Frame mainFrame = new Main_Frame(this);
	OrganizationFrame organizationFrame = new OrganizationFrame(this);

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
	
	public void backToMainMenu(){
		mainFrame.setVisible(true);
		organizationFrame.setVisible(false);
		projectFrame.setVisible(false);
	}
	
	public void showOrganizationFrame(){	
				mainFrame.setVisible(false);
				organizationFrame.setVisible(true);
				projectFrame.setVisible(false);

			}
	
	public void showProjectFrame() {
		mainFrame.setVisible(false);
		organizationFrame.setVisible(false);
		projectFrame.setVisible(true);
		
	}
	
	public void showAddDeptPane() {
		organizationFrame.getNewDepartmentPanel().setVisible(true);		
		organizationFrame.getReportsPanel().setVisible(false);
		organizationFrame.getEditDeptPanel().setVisible(false);
	}
	
	public void showEditDeptPane() {
		organizationFrame.getNewDepartmentPanel().setVisible(false);
		organizationFrame.getEditDeptPanel().setVisible(true);
		organizationFrame.getReportsPanel().setVisible(false);
	}
	
	public void showReportsPane() {
		organizationFrame.getNewDepartmentPanel().setVisible(false);
		organizationFrame.getEditDeptPanel().setVisible(false);
		organizationFrame.getReportsPanel().setVisible(true);
	}
		
		
	}


