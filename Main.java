/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Main {
	
	   public static void main(String[] args) {
	        University university;
                university = new University("Example University");
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Welcome to the university information system");
	            System.out.println("1. Add Department");
	            System.out.println("2. Add professor");
	            System.out.println("3. Add Student");
	            System.out.println("4. List department details");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice:");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1 -> {
                            System.out.print("Enter department name: ");
                            String departmentName = scanner.nextLine();
                            Department department = new Department(departmentName);
                             university.addDepartment(department);
                            System.out.println("Department added successfully!");
                        }
	                case 2 -> {
                        }
	                case 3 -> {
                        }
	                case 4 -> {
                        }
	                case 5 -> System.exit(0);
	                default -> System.out.println("Invalid choice. Please try again.");
	        }
	    }
}
	   

