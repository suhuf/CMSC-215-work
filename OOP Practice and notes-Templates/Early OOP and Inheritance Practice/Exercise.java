// fill in the parts where you see "Write your code" to complete the assignment

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        MyInteger n1 = new MyInteger(input.nextInt());
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        System.out.print("Enter a string: ");
        String s = input.next();
        System.out.println(MyInteger.parseInt(s));

        System.out.print("Enter an integer: ");
        MyInteger n2 = new MyInteger(input.nextInt());
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {

    private    int value;

    public MyInteger(int value){
        this.value = value;
    }


    public boolean equals(int num){
        return value == num;
    }

    public int getValue(){
        return value;
    }

    public static int parseInt(char[] c){

        return Integer.parseInt(new String(c));


    }

    public static int parseInt(String ss){

        return Integer.parseInt(ss);


    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }

        return true;
    }


    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }



    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }


}
