import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();

        // better way to write
        switch (empId) {
            case 1 -> System.out.println("Krish");
            case 2 -> System.out.println("Thankur");
            case 3 -> {
                System.out.println("Emp Id 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Departmemt");
                    default -> System.out.println("No department added!");
                }
            }
            default -> System.out.println("Enter valid empId");
        }
    }
}
