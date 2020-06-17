package is_retake;

import java.util.HashMap;
import java.util.Map;

public class ProjectRegister {
	
	private Map<String, Project> projectList = new HashMap<String, Project>();
	private int counter = 1000;
	
	public Map<String, Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(Map<String, Project> projectList) {
		this.projectList = projectList;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void addProject(Project project) {
		projectList.put(project.getProjectID(),project);
	}
	
	public void removeProject(Project project) {
		projectList.remove(project.getProjectID());
	}
	
	public Project findProject(String projectID) {
		return projectList.get(projectID);
	}
	
	public String projectIDGenerator() {
		String iD = "P"+Integer.toString(counter++);
		return iD;			
	}
	
	public void editProjectName(Project project, String name) {
		project.setName(name);
	}

	public void editProjectBudget(Project project, double budget) {
		project.setBudget(budget);
	}
}
