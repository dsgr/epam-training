package by.epam.training.msv.se02_5;

import java.util.ArrayList;

/**
 * 
 * @author serg
 *
 */
public class Mark<T> {
	private Subject subject;
	private T mark;
	
	public Mark(Subject subject, T mark){
		this.subject = subject;
		this.mark = mark;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public T getMark() {
		return mark;
	}

	public void setMark(T mark) {
		this.mark = mark;
	}	
}
