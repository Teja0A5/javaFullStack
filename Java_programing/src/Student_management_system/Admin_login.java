package Student_management_system;

import java.util.Scanner;

public class Admin_login {
    private static String admin_user = "admin";
    private static String admin_password = "admin123";

    public static boolean authenticateAdmin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter admin username: ");
        String username = sc.nextLine();

        System.out.print("Enter admin password: ");
        String password = sc.nextLine();

        if (username.isEmpty() ||password.isEmpty()) {
            System.err.println("Required of Password&UserName");
            return false;
        } else if(admin_user.equals(username)&&admin_password.equals(password)) {
            System.out.println("Admin logged in");
            return true;
        }else if(!admin_user.equals(username)||!admin_user.equals(password)) {
        	System.err.println("Invalid Credential");
       		
    }
        return false;  
    }
    public static void main(String[] args) {
        if (authenticateAdmin()) {
            // Proceed with admin operations
            System.out.println("Welcome, Admin!");
        } else {
            // Exit or retry 
            System.out.println("Access denied.");
        }
        }
    }





