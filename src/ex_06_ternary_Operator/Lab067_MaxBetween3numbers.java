package ex_06_ternary_Operator;

public class Lab067_MaxBetween3numbers {
    public static void main(String[] args) {
        // Find maximum numbers amongst 3 numbers
        int n1 = 100;
        int n2 = 9;
        int n3 = -11;
        // n1 > n2 and n1 > n3 -> n1
        // n2 > n1 and n2 > n3 -> n2
        // n3
        // A = (n1 > n3) ? n1 : n3
        // B = (n2 > n3) ? n2 : n3
        int max = (n1>n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println(max);
    }
}
