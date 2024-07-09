package classes_and_objects_exercises.solid_singleResponsibility;

public class UserRegistration {
	
	public static boolean registerUser(String username, String password) {
		return UserValidator.validateUsername(username) && UserValidator.validatePassword(password);
    }
}
