package Programs;

import java.util.Scanner;

class FactorialExample{
    public static void main(String args[]){
        int i,fact=1;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number");
        int number = myObj.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}