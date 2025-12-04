public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {3,7,-1,9};
        String[] fruits = {"mango", "guava", "apple","banana"};
        boolean[] attendace = {true, false, true, true};

        
        int[] arr = new int[10];
        arr[0] = 3;

        System.out.println(numbers[3]);
        // System.out.println(numbers[4]);
        System.out.println(fruits[3]);

        fruits[2] = "kiwi";
        System.out.println(fruits[2]);
        System.out.println(fruits.length);
        System.out.println(attendace.length);

        int i = 0;
        while(i <= fruits.length - 1) {
            System.out.println(fruits[i]);
            i++;
        }

        // fruits to english sentence
        int j = 0;
        System.out.println("The fruits that I have are ");
        while(j <= fruits.length - 1) {
            if(j == fruits.length - 1) {
                System.out.print(fruits[j] + ".\n");    
            } else if(j == fruits.length - 2) {
                System.out.print(fruits[j] + " and ");
            } 
            else {
                System.out.print(fruits[j] + ", ");
            }
            j++;
        }










    }
}
