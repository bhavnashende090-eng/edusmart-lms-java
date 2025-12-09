package projectEdusmart;

public class Student extends User implements ProgressTrackable {

	private String enrolledCourse1;
	private String enrolledCourse2;

	public Student(String name, String email, String userId) {
		super(name, email, userId);
		this.enrolledCourse1 = null;
		this.enrolledCourse2 = null;
	}

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

	@Override
	public void viewProfile() {
		System.out.println("\n--- Student Profile ---");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Courses: " + enrolledCourse1 + ", " + enrolledCourse2);
	}

	@Override
	public void trackProgress() {

		System.out.println(getName() + " is tracking progress...");
	}
}
