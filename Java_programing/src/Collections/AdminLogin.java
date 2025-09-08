package Collections;
import java.util.Scanner;

public class AdminLogin {
    private static String admin_user = "admin";
    private static String admin_password = "admin123";

    public static boolean authenticateAdmin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter admin username: ");
        String username = sc.nextLine();

        System.out.print("Enter admin password: ");
        String password = sc.nextLine();

        if (admin_user.equals(username) &&admin_password.equals(password)) {
            System.out.println("Admin login successful!");
            return true;
        } else {
            System.out.println("Invalid admin credentials!");
            return false;
        }
    }

    public static void main(String[] args) {
        if (authenticateAdmin()) {
            // Proceed with admin operations
            System.out.println("Welcome, Admin!");
        } else {
            // Exit or retry logic
            System.out.println("Access denied.");
        }
    }
}
