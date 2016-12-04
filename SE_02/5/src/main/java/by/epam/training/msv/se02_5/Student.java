package by.epam.training.msv.se02_5;

import java.util.ArrayList;
import java.util.List;

public class Student<T> {
	private String name;
	private List<Mark> marksList = new ArrayList<>();
	private List<Subject> subjectsList = new ArrayList<>();
	
	public Student(String name){
		this.name = name;
	}
	
	public void addToSubject(Subject subject){
		subjectsList.add(subject);
	}
		
	public void addMark(Subject subject, T mark ){
		if(subject.getTypeOfMarks().equals(mark.getClass().getName())){
			marksList.add(new Mark(subject, mark));
		}else{
			System.out.println("Неверны тип оценкинки!");
			System.out.println("Ожидаем " + subject.getTypeOfMarks() );
			System.out.println("Пришло " + mark.getClass().getName() );
		}
	}
	
	public void getSubjects(){
		System.out.println(this.name+"`s subjects:");
		for(Subject s: subjectsList){
			System.out.println(s.getName());		
		}
	}
	public void getMarks(Subject subject){
		System.out.println(this.name + "`s " + subject.getName() + " marks:");
		for(Mark m: marksList){
			if(m.getSubject() == subject ){
				System.out.println(m.getMark());
			}
		
		
		}		
	}
	

}
