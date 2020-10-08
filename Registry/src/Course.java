import java.util.ArrayList;

public class Course {
	
	private String name;
	private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
	private Room room;
	
	public Course(String name, Room room) {
		
		this.name = name;
		this.room = room;
	}
	
	public String getName() {
		
		return name;
	}
	
	public Room getRoom() {
		
		return room;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setRoom(Room room) {
		
		this.room = room;
	}
	
	public void capacity() {
		System.out.println("Capacity: " + room.getCapacity());
	}
	
	public void enrollStudent(Student student) {
		
		if(room.getCapacity() > 0) {
			
			enrolledStudents.add(student);
			student.enrollInCourse(this);
			int newCapacity = room.getCapacity() - 1;
			room.setCapacity(newCapacity);
		}else {
			
			System.out.println("The Room is full");
		}
		
	}
		
	public void enrolledStudents() {
			
		for(int i=0; i<enrolledStudents.size(); i++) {
				
			System.out.println(i+1 + ") " + enrolledStudents.get(i).getName() + 
					" " + enrolledStudents.get(i).getId());
		}
				
	}	
	
		
	

}
