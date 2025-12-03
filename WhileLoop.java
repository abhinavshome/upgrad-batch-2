public class WhileLoop {
    public static void main(String[] args) {
        // int x = 3;
        int x = 0;
        while(x < 1000) {
            System.out.println(x + ". do something");
            x++;
        }

        System.out.println(x);

        int y = 2;
        while (y <= 100) {
            System.out.println(y);
            y += 2;
            x++;
        }

        System.out.println(x);

        for(int z = 1; z <=100; z+=2) {
            System.out.print(z + " ");
        }

        int n1 = 9832;
        int m = 1;
        int numOfDigits = 0;
        while(m < n1) {
            m = m*10;
            numOfDigits++;
        }

        System.out.println("num of digits: " + numOfDigits);

        int n2 = n1;
        for(int i = numOfDigits; i > 0; i--) {
            System.out.println(i);

            int numberToDivide = 1;
            for(int k = 1 ; k <= i; k++) {
                numberToDivide *= 10;
            }
            System.out.println("number to divide" + numberToDivide);
            System.out.println(n2/(numberToDivide/10));

            n2 = n2 % (numberToDivide/10);
        }

        // while (x <= 30) {
        //     System.out.println("x is " + x);
        //     x++;
        //     // scope
        //     // int y = 5;
        //     // System.out.println(y);
        // }

        // System.out.println(y); //Error not available outside scope

        // for(int y = 0; y < 13; y+=2) {
        //     System.out.println(y);
        // }

        // int z = 3;

        // do {
        //     System.out.println(z);
        //     z += 3;
        // } while(z < 22);

        


    }
}
