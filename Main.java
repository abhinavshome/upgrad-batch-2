import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    int input = myObj.nextInt();  // Read user input
    System.out.println(input*2);  // Output user input
  }
}