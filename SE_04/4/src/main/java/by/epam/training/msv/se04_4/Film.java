package by.epam.training.msv.se04_4;

import java.io.Serializable;

public class Film implements Serializable {
	private static final long serialVersionUID = 1L;
	private String title;
	private Actor mainActor;

	public Film(String title, Actor mainActor) {
		this.title = title;
		this.mainActor = mainActor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Actor getMainActor() {
		return mainActor;
	}

	public void setMainActor(Actor mainActor) {
		this.mainActor = mainActor;
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", mainActor=" + mainActor + "]";
	}

}
