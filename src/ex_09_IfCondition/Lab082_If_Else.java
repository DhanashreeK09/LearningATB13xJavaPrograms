package ex_09_IfCondition;

import java.util.Scanner;

public class Lab082_If_Else {
    public static void main(String[] args) {

        //int age = Integer.parseInt(args[0]);
        System.out.println("Enter age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age<18){
            System.out.println("Not allowed");
        }else{
            System.out.println("Allowed");
        }
    }
}
