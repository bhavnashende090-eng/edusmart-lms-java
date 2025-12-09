package projectEdusmart;

public abstract class User {

	private String name;
	private String email;
	private String userId;

	User(String name, String email, String userId) {

		this.name = name;
		this.email = email;
		this.userId = userId;

	}

	public String getName() {

		return name;
	}

	public String getEmail() {

		return email;
	}

	public String getUserId() {

		return userId;
	}

	public abstract void viewProfile();

	public final void displayWelcome() {

		System.out.println("Welcome to EduSmart LMS, " + "Bhavna" + "!");
	}
}
