import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = scanner.nextInt();

        int x = 1;
        while (x <= 10) {
            System.out.println(n + " x " + x + " = " + n*x);
            x++;
        }
    }
}
