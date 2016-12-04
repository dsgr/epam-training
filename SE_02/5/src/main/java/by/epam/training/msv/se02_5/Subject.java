package by.epam.training.msv.se02_5;

public class Subject {
	private String name;
	private String typeOfMarks;
	
	public Subject(String name, String typeOfMarks){
		this.name = name;
		this.typeOfMarks = typeOfMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfMarks() {
		return typeOfMarks;
	}

	public void setTypeOfMarks(String typeOfMarks) {
		this.typeOfMarks = typeOfMarks;
	}
	
		

}
