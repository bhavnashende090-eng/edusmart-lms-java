package projectEdusmart;


/* The Instructor class represents an instructor user in the EduSmart LMS system.
   It extends the User class, allowing instructors to create courses and view their profile.
   An instructor can create up to two courses. Created course names are stored internally. */
 
public class Instructor extends User {

	private String createdCourse1;
	private String createdCourse2;
	
// Constructs an Instructor with the given user details. Initially, no courses are created
	
	public Instructor(String name, String email, String userId) {
		super(name, email, userId);
		this.createdCourse1 = null;
		this.createdCourse2 = null;
	}
// Creates a course with the given name. An instructor can create at most two courses.
	public void createCourse(String courseName) {
		if (this.createdCourse1 == null) {
			this.createdCourse1 = courseName;
			System.out.println(getName() + " created course: " + courseName);
			
		} 
		else if (this.createdCourse2 == null) {
			this.createdCourse2 = courseName;
			System.out.println(getName() + " created course: " + courseName);
		}
		else {
			System.out.println("Cannot create more than 2 courses.");
		}
	}
	
/*  Displays the instructor's profile, including personal details and the list of courses the instructor has created.
    This method overrides the abstract method from the User base class. */

	@Override
	public void viewProfile() {
		System.out.println("\n--- Instructor Profile ---");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Created Courses: " + createdCourse1 + ", " + createdCourse2);
	}
}
