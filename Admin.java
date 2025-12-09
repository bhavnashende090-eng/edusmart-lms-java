package projectEdusmart;

/* The Admin class represents an administrative user in the EduSmart LMS system.Admins have special privileges, such as removing users from the system.
   This class extends the User base class, inheriting common user details and behavior.
*/

public class Admin extends User {

// Constructs an Admin with the given details
	
	public Admin(String name, String email, String userId) {
		super(name, email, userId);
	}

// Removes a user from the system.
	public void removeUser(User user) {
		System.out.println("Admin removed user: " + user.getName());
	}
	
// Displays the admin's profile including personal details. Overrides the abstract method from the User class.

	@Override
	public void viewProfile() {
		
		System.out.println("\n--- Admin Profile ---");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
	}
}
