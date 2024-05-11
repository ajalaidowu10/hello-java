package basics;
import java.util.Scanner;
public class ReadInputFromUserExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.println("Enqter your Age: ");
            int age = scanner.nextInt();
            System.out.println("Enter Gender: ");
            char gender = scanner.next().charAt(0);
            System.out.println("Enter Contact No.: ");
            String contact = scanner.nextLine();

            System.out.println("Name: "+ name);
            System.out.println("Age: "+ age);
            System.out.println("Gender: "+ gender);
            System.out.println("Contact: "+ contact);
        }
    }
}