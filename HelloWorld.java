public class HelloWorld {
    public static void main(String[] args) {

        // This is my first Java Code
        // And I hope it turns out great

        /* 
        
            This is my first Java code
        
        */
        System.out.println("Hello World"); // This line only prints
        System.out.println("How are you today?");


        
        byte smallNumber = -123;
        short anotherNumber = 1223;
        long n = 23;
        char letter = 'a';

        char anotherLetter = 36;


        boolean isIndian = true;
        boolean isWarm = false;
        
        System.out.println(isIndian);
        System.out.println(isWarm);
        System.out.println(letter);
        System.out.println(anotherLetter);


        String welcomeMessage = "Hey! How are you?";
        System.out.println(welcomeMessage.toLowerCase());


        double distance = 12.22;
        float heightInCms = 180.22f;

        System.out.println(n);
        System.out.println(heightInCms);



        // reassign variables
        int n1 = 23;
        System.out.println(n1);
        n1 = 33;
        System.out.println(n1);

        //final variables or constants
        final int n2 = 23;
        System.out.println(n2);
        // n2 = 33; //ERROR


        int n3 = 2399999;
        byte n4 = 2;
        n3 = n4;
        // n4 = n3; //Error

        //Declare and initialze later
        int n5;
        n5 = 33;

        //Declare many variables in one go
        int n6 = 4, n7 = 9, n9 = 22;

        //Delcare multiple variables to one value
        int x1, x2, x3;
        x1 = x2 = x3 = 7;

        // int 2x = 23; // Invaid
        int _x = 23;

        int weightInKilos = 34;

        int weightInGrams = weightInKilos*1000;
        System.out.println(weightInGrams);






    }
}
