package assignment3;

import java.util.ArrayList;
import java.util.List;

class Company {
	private String name;
	private List<Project> projects;

	public Company(String name) {
		this.name = name;
		this.projects = new ArrayList<>();
	}

	public void addProject(Project project) {
		projects.add(project);
	}

	public List<Project> getProjects() {
		return projects;
	}

}

class Project {
	private String name;
	private Company company;
	private List<Professional> professionals;

	public Project(String name, Company company) {
		this.name = name;
		this.company = company;
		this.professionals = new ArrayList<>();
	}

	public void addProfessional(Professional professional) {
		professionals.add(professional);
	}

	public List<Professional> getProfessionals() {
		return professionals;
	}

}

class Professional {
	private String name;
	private List<LearningGroup> learningGroups;

	public Professional(String name) {
		this.name = name;
		this.learningGroups = new ArrayList<>();
	}

	public void addLearningGroup(LearningGroup learningGroup) {
		learningGroups.add(learningGroup);
	}

	public List<LearningGroup> getLearningGroups() {
		return learningGroups;
	}

}

class LearningGroup {
	private String name;

	public LearningGroup(String name) {
		this.name = name;
	}

}

class Assosciation {
	public static void main(String[] args) {
		// Composition
		Company company = new Company("ABC Company");
		Project project = new Project("Project A", company);
		company.addProject(project);

		// Aggregation
		Professional professional1 = new Professional("John");
		Professional professional2 = new Professional("Emily");
		project.addProfessional(professional1);
		project.addProfessional(professional2);

		// Association
		Project projectB = new Project("Project B", company);
		Professional professional3 = new Professional("Michael");
		projectB.addProfessional(professional3);

		// Aggregation (Professionals can exist even if the Company doesn't exist)
		Professional professional4 = new Professional("Sophia");

		// Aggregation (Learning groups exist independently of Professionals)
		LearningGroup javaLearningGroup = new LearningGroup("Java Learning Group");
		LearningGroup aiLearningGroup = new LearningGroup("AI Learning Group");
		professional1.addLearningGroup(javaLearningGroup);
		professional1.addLearningGroup(aiLearningGroup);
	}
}
