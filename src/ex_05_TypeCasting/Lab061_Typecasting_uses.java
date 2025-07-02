package ex_05_TypeCasting;

public class Lab061_Typecasting_uses {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+(int)GST; // Typecast Explicit narrowing
        // System.out.println(total); <-- Data loss as here value will be just 118
        float total  = (float)course+GST;
        System.out.println(total); // Use correct datatype now this will give 118.45
    }
}
