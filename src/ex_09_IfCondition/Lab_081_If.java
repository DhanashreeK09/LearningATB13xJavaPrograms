package ex_09_IfCondition;

public class Lab_081_If {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age >18){
            System.out.println("Allowed");
        } else {
            System.out.println("NotAllowed");
        }
        }
}
