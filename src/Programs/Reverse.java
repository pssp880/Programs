package Programs;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int reversed = 0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number to be reversed");
        int num = myObj.nextInt();
        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}