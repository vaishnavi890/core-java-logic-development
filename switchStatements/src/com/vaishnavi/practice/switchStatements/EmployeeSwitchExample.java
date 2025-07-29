package com.vaishnavi.practice.switchStatements;

import java.util.*;

public class EmployeeSwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== Employee Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    employees.add(new Employee(id, name, dept));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    // View
                    System.out.println("All Employees:");
                    for (Employee e : employees) {
                        e.display();
                    }
                    break;

                case 3:
                    // Update
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.id == updateId) {
                            System.out.print("Enter new name: ");
                            e.name = sc.nextLine();
                            System.out.print("Enter new department: ");
                            e.department = sc.nextLine();
                            System.out.println("Employee updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    // Delete
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    Employee toRemove = null;
                    for (Employee e : employees) {
                        if (e.id == deleteId) {
                            toRemove = e;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        employees.remove(toRemove);
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}


