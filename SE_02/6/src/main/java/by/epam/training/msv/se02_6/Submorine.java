package by.epam.training.msv.se02_6;

@MyAnnotation("Some text here..")
public class Submorine {

	private String name;
	
	public Submorine(String name){
		this.name = name;
	}
	
	public void start(){
		Engine.start();
	}
	
	private static class Engine{
		public static void start(){
			System.out.println("Engine started.");
		}
	}
	
	
}
