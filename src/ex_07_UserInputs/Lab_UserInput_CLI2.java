package ex_07_UserInputs;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        // If in configuration you dont add any arguments
        // you will get error if you try to call it as below
        System.out.println(args[0]); //java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
