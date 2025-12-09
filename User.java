package projectEdusmart;

/*  The User class serves as an abstract base class for all types of users in the EduSmart LMS system.
    It provides common fields such as name, email, and userId, and defines shared behavior for all child classes. 
    This is the base class User..Whenever any child class call the parent constructor from super() so this fields get called. 
    */

public abstract class User {

	private String name;
	private String email;
	private String userId;

// Constructs a User object with the given details. Child classes can call this constructor using super()
	User(String name, String email, String userId) {

		this.name = name;
		this.email = email;
		this.userId = userId;

	}
// Using getter method get the details .
	public String getName() {

		return name;
	}

	public String getEmail() {

		return email;
	}

	public String getUserId() {

		return userId;
	}
	
//  Displays the user's profile details. All subclasses must provide their own implementation.
	
	public abstract void viewProfile();

// Using final keyword we cannot override this method. All users will see the same welcome message

	public final void displayWelcome() {
		

		System.out.println("Welcome to EduSmart LMS, " + "name" + "!");
	}
}
