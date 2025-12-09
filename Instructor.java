package projectEdusmart;

public class Instructor extends User {

	private String createdCourse1;
	private String createdCourse2;

	public Instructor(String name, String email, String userId) {
		super(name, email, userId);
		this.createdCourse1 = null;
		this.createdCourse2 = null;
	}

	public void createCourse(String courseName) {
		if (this.createdCourse1 == null) {
			this.createdCourse1 = courseName;
			System.out.println(getName() + " created course: " + courseName);
		} else if (this.createdCourse2 == null) {
			this.createdCourse2 = courseName;
			System.out.println(getName() + " created course: " + courseName);
		} else {
			System.out.println("Cannot create more than 2 courses.");
		}
	}

	@Override
	public void viewProfile() {
		System.out.println("\n--- Instructor Profile ---");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Created Courses: " + createdCourse1 + ", " + createdCourse2);
	}
}
