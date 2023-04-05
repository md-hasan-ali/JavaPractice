package basics;

import java.util.Scanner;

public class Variable {
    public static void main(StringType[] args) {
        int num1 , num2;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        int result=num1+num2;
        System.out.println("Sum = "+result);
    }
}
