package projectEdusmart;

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

	// Constructor 2 (Overloaded)
	public Course(String title) {
		this.title = title;
		this.durationInHours = 0;
		this.maxStudents = 50;
	}

	public void showCourseDetails() {
		System.out.println("\n--- Course Details ---");
		System.out.println("Title: " + title);
		System.out.println("Duration: " + durationInHours + " hours");
		System.out.println("Max Students: " + maxStudents);
	}

}
