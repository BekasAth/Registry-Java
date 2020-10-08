import java.util.ArrayList;

public class Registry {
	
	private String name;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Registry(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void addCourse(Course course) {
		
		courses.add(course);
	}
	
	public void printCourses() {
		
		System.out.println("Courses of department " + name);
		
		for(int i=0; i<courses.size(); i++) {
			
			System.out.println(i+1 + ") " + courses.get(i).getName());
		}
	}
	

}






