package ex_04_Operators;

public class Lab043_Interview_Concatation_Plus {
    public static void main(String[] args) {
        String first_name = "Dhanashree";
        String last_name = "Khadamkar";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
    }
}
