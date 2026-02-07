// Program: oldApp.java 
// Grant Dresser
// 2/6/2026

import java.util.Scanner;

public class oldApp {

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        int age;
        int futureAge;

        System.out.print("How old are you? ");
        age = userinput.nextInt();

        futureAge = age + 5;

        System.out.println("In 5 years you will be " + futureAge + " years old.");

        System.out.println("It is " + (age >= 13 && age <= 19) + " that you are currently a teenager.");

        System.out.println("I am such a smart computer.");
    }
}

// Fixed the syntax, corrected data types, correctly added the Scanner import, corrected the logic and the conditional statement to check for teenagers. Addionally made it more clear that the code is checking your current age. 