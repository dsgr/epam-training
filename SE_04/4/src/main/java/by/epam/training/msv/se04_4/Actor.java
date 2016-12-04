package by.epam.training.msv.se04_4;

import java.io.Serializable;

public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;
	private String fullName;
	private String dateOfBirdth;

	public Actor(String fullName, String dateOfBirdth) {
		this.fullName = fullName;
		this.dateOfBirdth = dateOfBirdth;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirdth() {
		return dateOfBirdth;
	}

	public void setDateOfBirdth(String dateOfBirdth) {
		this.dateOfBirdth = dateOfBirdth;
	}

	@Override
	public String toString() {
		return "Actor [fullName=" + fullName + ", dateOfBirdth=" + dateOfBirdth + "]";
	}

}
