package projectEdusmart;

/* The Student class represents a student user in the EduSmart LMS system.It extends the User class and implements ProgressTrackable to allow
   progress tracking capabilities. A student can enroll in up to two courses and can view their profile details.
 */

public class Student extends User implements ProgressTrackable {

	private String enrolledCourse1;
	private String enrolledCourse2;

//Creates a Student object with the given user details.Initially, no courses are enrolled.
	
	public Student(String name, String email, String userId) {
		super(name, email, userId);
		this.enrolledCourse1 = null;
		this.enrolledCourse2 = null;
	}
// Enrolls the student into a course. A student can enroll in a maximum of two courses.
	public void enrollCourse(String courseName) {
		
		if (this.enrolledCourse1 == null) {
		    this.enrolledCourse1 = courseName;
			System.out.println(getName() + " enrolled in: " + courseName);
			
		} else if (this.enrolledCourse2 == null) {
			
			this.enrolledCourse2 = courseName;
			System.out.println(getName() + " enrolled in: " + courseName);
			
		} else {
			System.out.println("Enrollment failed! Max 2 courses allowed.");
		}
	}

/* Displays the student's profile information including personal details and enrolled courses.
   This method overrides the abstract method from the User class. */
	
	@Override
	public void viewProfile() {
		
		System.out.println("\n--- Student Profile ---");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Courses: " + enrolledCourse1 + ", " + enrolledCourse2);
	}
	
/*  Implements the progress tracking feature from the ProgressTrackable interface.
	Shows a message indicating that the student is tracking progress.*/

	@Override
	public void trackProgress() {

		System.out.println(getName() + " is tracking progress...");
	}
}
