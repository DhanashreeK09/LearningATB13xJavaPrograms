package ex_07_UserInputs;

import ex_05_TypeCasting.Lab057_TypeCasting;

import java.util.Scanner;

public class Lab_UserInput_ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");

        int age = scanner.nextInt();
        String CanIVote = (age>18)? "Yes you can vote" : "No you cannot vote";
        System.out.println(CanIVote);
    }
}
