package String;

import java.util.Scanner;

public class Prac1 {
    public boolean IVB(String str){
        if(str == null || str.isEmpty()){
            return false;
        }
        if(!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_'){
            return false;
        }

        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '_'){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Prac1 obj = new Prac1();
        while(true){
            String input = scn.nextLine().trim();
            System.out.println("Enter an identifier (ctrl+c to quit)");
            boolean isValid = obj.IVB(input);
            if(isValid) {
                System.out.println("\"" + input + "\"is a valid identifier.");
            } else{
                System.out.println("\" + input + \"\\\"is NOT a valid identifier.\"");
                System.out.println("1. Start with letter, number or underscore");
                System.out.println("2. contain only letter no. or underscore");
                System.out.println("Not be empty");
            }
            System.out.println();
            break;
        }
    }
}
