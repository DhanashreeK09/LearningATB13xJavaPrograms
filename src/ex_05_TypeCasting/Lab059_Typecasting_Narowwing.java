package ex_05_TypeCasting;

public class Lab059_Typecasting_Narowwing {
    public static void main(String[] args) {
        int val = 300;
       // byte b = val; // Narrowing casting mplicit gives error
        byte b1 = (byte)val;
        // while narrowing casting you need to explicitly mention the data type
        // Possibility of data loss
        System.out.println(b1);


    }
}
