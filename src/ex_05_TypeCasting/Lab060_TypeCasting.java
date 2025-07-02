package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 9637002355l;
        short s = (short)phone;// explicit casting as it is narrowing and data loss is expected
        System.out.println(s);
    }
}
