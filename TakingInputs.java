import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        if(age < 30) {
            System.out.println("Hey! you are so young!");
        } else {
            System.out.println("You are welcome!");
        }
        System.out.println();
    }
}
