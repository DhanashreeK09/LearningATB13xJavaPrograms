package ex_02_Java_Basics;

public class Lab023_NumericDataTypes {
    public static void main(String[] args) {
        byte b = 100;
        // b = 128; <--- the max range is 127 for byte so 128 value is not valid
        b = -127;   // this fits in range
        int i = 10;
        short s = 90;
        char c = 'a';
        long l = 9637900235l;
        long l1 = 85455777L;
        System.out.println(i);
        System.out.println(s);
        System.out.println(c);
        System.out.println(l);
        System.out.println(l1);
        System.out.println(b);
        System.out.println(i);

    }
}
