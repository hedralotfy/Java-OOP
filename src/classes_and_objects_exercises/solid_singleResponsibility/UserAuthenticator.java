package classes_and_objects_exercises.solid_singleResponsibility;

public class UserAuthenticator {

	public static boolean authenticateUser(String username, String password) {
		// Validate username and password
		return UserValidator.validateUsername(username) && UserValidator.validatePassword(password);
	}
}
