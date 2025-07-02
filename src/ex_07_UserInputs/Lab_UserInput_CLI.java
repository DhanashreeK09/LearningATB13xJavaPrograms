package ex_07_UserInputs;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        //int age = 65;
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String CanIVote = (age>18) ? "Yes" : "No";
        System.out.println(CanIVote);

    }

}
