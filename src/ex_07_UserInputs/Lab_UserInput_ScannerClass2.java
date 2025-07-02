package ex_07_UserInputs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_UserInput_ScannerClass2 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the int");
        int int_input = scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter double");
        double d = scanner.nextDouble();
        System.out.println(d);

    }
}
