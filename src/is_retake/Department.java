package is_retake;

import java.util.HashMap;
import java.util.Map;

public class Department {

	private String name;
	private double budget;
	private Map<String, Project> projectList = new HashMap<String, Project>();

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

	public Map<String, Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(Map<String, Project> projectList) {
		this.projectList = projectList;
	}

	public void addProject(Project project) {
		this.projectList.put(project.getProjectID(), project);
	}

	public void removeProject(Project project) {
		this.projectList.remove(project.getProjectID());
	}


}
