package projectEdusmart;

public class EdusmartMainClass {

	public static void main(String[] args) {

		Student student1 = new Student("Bhavna", "bhavna@mail.com", "Student-101");
		Student student2 = new Student("Billi", "billi@mail.com", "Student-102");

		Instructor inst1 = new Instructor("Kavita", "kavita@mail.com", "Instructor-201");
		Instructor inst2 = new Instructor("Neha", "neha@mail.com", "Instructor-202");

		Admin admin = new Admin("Master Admin", "admin@mail.com", "ADMIN-001");

		inst1.createCourse("Java Basics");
		inst1.createCourse("Core Java");

		inst2.createCourse("Python Fundamentals");
		inst2.createCourse("Data Science Intro");

		student1.enrollCourse("Java Basics");
		student1.enrollCourse("Core Java");

		student2.enrollCourse("Python Fundamentals");
		student2.enrollCourse("Data Science Intro");

		student1.viewProfile();
		student2.viewProfile();
		inst2.viewProfile();
		inst2.viewProfile();
		inst2.viewProfile();

		student1.trackProgress();
		student2.trackProgress();

		admin.removeUser(student2);

		Course c1 = new Course("Java Basics", 20, 30);
		Course c2 = new Course("Python Fundamentals");

		c1.showCourseDetails();
		c2.showCourseDetails();
	}

}
