package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;

        // int a = b;   <-- Implicit casting
        int a1 = (int)b; // here we have explicitly added data type so this is Explicit casting widening
        System.out.println(a1);

    }
}
