import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();

        int sum = 0;

        while(n > 0) {
            System.out.print(n + " ");
            System.out.print(n % 10);
            System.out.println();
            sum += n%10;
            n = n/10;
        }

        System.out.println("Sum of all the digits is: " + sum);

    }
}
