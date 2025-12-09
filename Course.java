package projectEdusmart;

/* The Course class represents a course within the EduSmart LMS system. A course contains basic details such as title, duration, and maximum 
number of students allowed.It includes overloaded constructors for flexible course creation and a method to display course details.*/

public class Course {

	private String title;
	private int durationInHours;
	private final int maxStudents;

	// Constructor 1
	public Course(String title, int durationInHours, int maxStudents) {
		this.title = title;
		this.durationInHours = durationInHours;
		this.maxStudents = maxStudents;
	}
// Creates a Course with only a title. Default duration is 0 hours, and max students is set to 50
	// Constructor 2 (Overloaded)
	public Course(String title) {
		this.title = title;
		this.durationInHours = 0;
		this.maxStudents = 50;
	}

//Displays complete course details such as title, duration, and maximum student capacity.
	public void showCourseDetails() {
		System.out.println("\n--- Course Details ---");
		System.out.println("Title: " + title);
		System.out.println("Duration: " + durationInHours + " hours");
		System.out.println("Max Students: " + maxStudents);
	}

}
