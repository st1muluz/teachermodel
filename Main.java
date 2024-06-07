import controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Teacher");
            System.out.println("2. Edit Teacher");
            System.out.println("3. Display Teacher");
            System.out.println("4. Display All Teachers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();
                    controller.createTeacher(id, name, subject);
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new name (leave blank to keep current): ");
                    name = scanner.nextLine();
                    System.out.print("Enter new subject (leave blank to keep current): ");
                    subject = scanner.nextLine();
                    controller.editTeacher(id, name.isEmpty() ? null : name, subject.isEmpty() ? null : subject);
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    id = scanner.nextInt();
                    controller.displayTeacher(id);
                    break;
                case 4:
                    controller.displayAllTeachers();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
