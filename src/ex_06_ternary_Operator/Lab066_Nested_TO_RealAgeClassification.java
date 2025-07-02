package ex_06_ternary_Operator;

public class Lab066_Nested_TO_RealAgeClassification {
    public static void main(String[] args) {
        // Real Age Classification
        // age = 23;
        // age < 18 ; Minor
        // 18 < age >65 ; Adult
        // age > 65 ; Senior
        int age = 23;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);


    }
}
