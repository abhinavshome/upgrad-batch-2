public class IfElseDemo {
    public static void main(String[] args) {
        
        int age = 23;
        int ageInMonths = age * 12;
        boolean isAdult = age > 18;
        boolean isMinor = age < 18;

        boolean isCoffeeWarm = true;
        boolean isCoffeeCold = !isCoffeeWarm;
        System.out.println(isAdult);
        System.out.println(isMinor);


        if(isAdult) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // if(!isAdult) {
        //     System.out.println("Minor");
        // }


        int studentAge = 23;

        // if(studentAge < 10) {
        //     System.out.print("He is a kid");
        // } 
        
        // if(studentAge > 10 && studentAge < 20 ) {
        //     System.out.print("He is a teenager");
        // }
        if(studentAge < 10) {
            System.out.print("He is a kid");
        } else if (studentAge < 20 ) {
            System.out.print("He is a teenager");
        } else if (studentAge < 30 ) {
            System.out.print("He is in his youth");
        } else {
            System.out.print("He is a big guy!");
        }



    }
}
