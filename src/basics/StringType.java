package basics;

import java.util.Scanner;

public class StringType {

 String n;

    public String goo(String n) {
        return n;
    }

    public void display(){
        System.out.println("this is display");
    }

    public static void main(String[] args) {
        StringType s1 = new StringType();
        s1.goo("Hasan Ali");
        s1.display();



        String firstName;
        String lastName;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first name: ");
        firstName= s.next();
        System.out.println("Enter your last name: ");
        lastName=s.next();
        System.out.println(firstName +" "+ lastName);

        // aro 2 ta string

        double d1, d2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        d1 = scanner.nextDouble();
        System.out.println("Enter Number 2: ");
        d2 = scanner.nextDouble();
        double result;
        result = d1 + d2;
        System.out.println(result);

    }
}
