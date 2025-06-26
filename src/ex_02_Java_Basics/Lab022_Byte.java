package ex_02_Java_Basics;

public class Lab022_Byte {
    public static void main(String[] args) {
        byte b = 100;
        // b = 128; <--- the max range is 127 for byte so 128 value is not valid
        b = -127;   // this fits in range
        System.out.println(b);
    }
}
