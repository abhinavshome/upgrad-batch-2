public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        // Order
        /*
         * () - Parentheses
         * , /, % - Multiplication, Division, Modulus
         * +, - - Addition, Subtraction
         * >, <, >=, <= - Comparison
         * ==, != - Equality
         * && - Logical AND
         * || - Logical OR
         * = - Assignment
         */

        int x = 2;
        int y = x + 3;
        // int z = 9 + 3;
        int z = x + (y * 2);
        double x2 = 2;
        double x1 = x2/3;

        x = 42;
        System.out.println(x);
        // x = x + 1;
        // x += 2;
        x++;
        System.out.println(x);

        System.out.println(7 % 3);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(z);

        //Assignment operators
        String name = "Sam";
        name += " Uncle";

        int y1 = 2;
        y1 -= 3;

        y1 *= 10;

        System.out.println(name);
        System.out.println(y1);

        //Comparision opetators
        int temp = 40;
        boolean isTempHot = temp  > 40;
        System.out.println(isTempHot);

        String myName = "Abhinav";
        boolean isNameCorrect = myName == "abhinav";
        System.out.println(isNameCorrect);

        System.out.println(2 != 3);

        // Logical operators
        boolean b1 = true;
        boolean b2 = false;
        boolean c1 = b1 && b2;
        System.out.println(c1);

        boolean d1 = b1 || b2;
        System.out.println(d1);

        boolean d2 = !b1;
        System.out.println(d2);


        
    }
}
