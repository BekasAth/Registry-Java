
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Some examples for checking purpose...
		
		Student s1 = new Student("giorgos", "dai1");
		Student s2 = new Student("dimitris", "dai2");
		Student s3 = new Student("dimi", "dai3");
		
		Room r1 = new Room("room1", 2);
		Room r2 = new Room("room2", 2);
		
		Course c1 = new Course("course1", r1);
		Course c2 = new Course("course2", r2);
		
		Registry reg1 = new Registry("dai");
		
		reg1.addCourse(c2);
		reg1.addCourse(c1);
		
		c1.enrollStudent(s1);
		c1.enrollStudent(s2);
		c2.enrollStudent(s2);
		
		
		c1.enrolledStudents();
		c2.enrolledStudents();
		
		s1.printData();
		
		reg1.printCourses();
		
		s2.printData();
		
		c1.enrollStudent(s3);
		
		c2.capacity();
		c1.capacity();
		
		
		
		

	}

}
