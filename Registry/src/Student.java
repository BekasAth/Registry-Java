import java.util.ArrayList;

public class Student {
	
	private String name;
	private String id;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	
 	public Student(String name, String id) {
		
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getId() {
		
		return id;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setId(String id) {
		
		this.id = id;
	}
	
	public void enrollInCourse(Course course) {
		
		courses.add(course);
	}
	
	public void printData() {
		
		System.out.println("Student's Name: " + name);
		System.out.println("Student's Id: " + id);
		
		System.out.println("Courses: ");
		
		for(int i=0; i<courses.size(); i++) {
			
			System.out.println(i+1 + ") " + courses.get(i).getName());
		}
		
	}

}
