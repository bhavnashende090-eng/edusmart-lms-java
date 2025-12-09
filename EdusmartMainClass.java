package projectEdusmart;

/*  The EdusmartMainClass serves as the entry point for the EduSmart LMS system.It demonstrates how Students, Instructors, Admins, and Courses interact
within the application.This class shows object creation, course enrollment, course creation progress tracking, user removal, and course detail display. */

public class EdusmartMainClass {

	public static void main(String[] args) {
		
		
		
        
		// Creating students Object
		Student student1 = new Student("Bhavna", "bhavna@mail.com", "Student-101");
		Student student2 = new Student("Billi", "billi@mail.com", "Student-102");
		
		//Creating instructors

		Instructor inst1 = new Instructor("Kavita", "kavita@mail.com", "Instructor-201");
		Instructor inst2 = new Instructor("Neha", "neha@mail.com", "Instructor-202");
		
		 // Creating admin
		Admin admin = new Admin("Master Admin", "admin@mail.com", "ADMIN-001");
		
		// Instructors creating courses

		inst1.createCourse("Java Basics");
		inst1.createCourse("Core Java");

		inst2.createCourse("Python Fundamentals");
		inst2.createCourse("Data Science Intro");
		
		// Students enrolling in courses

		student1.enrollCourse("Java Basics");
		student1.enrollCourse("Core Java");

		student2.enrollCourse("Python Fundamentals");
		student2.enrollCourse("Data Science Intro");
		
		 // Viewing Profiles
		
		student1.displayWelcome();
		student1.viewProfile();
		student2.displayWelcome();
		student2.viewProfile();
		inst1.displayWelcome();
		inst1.viewProfile();
		inst2.viewProfile();
		
		// Tracking progress

		student1.trackProgress();
		student2.trackProgress();
		
		 // Admin removing a user
		admin.displayWelcome();
		admin.removeUser(student2);
		
		// Creating courses

		Course c1 = new Course("Java Basics", 20, 30);
		Course c2 = new Course("Python Fundamentals");
		
		 // Displaying course details

		c1.showCourseDetails();
		c2.showCourseDetails();
		
	}
	

}
