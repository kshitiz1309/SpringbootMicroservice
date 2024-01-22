package practice;

import java.util.Map;

public class BalanceString {
    public static void main(String[] args) {
        String expr = "[([{}])]";

        Map<Character, Character> exprmap = Map.of('(', ')', '[', ']', '{', '}');
        int start = 0;
        int end = expr.length()-1;
        int counter = expr.length() / 2;
        while (start < end) {
            if (exprmap.containsKey(expr.charAt(start))) {
                if (expr.charAt(end) == exprmap.get(expr.charAt(start))) {
                    counter--;
                }
            }
            start++;
            end--;
        }
        if(counter==0){
            System.out.println("balanced string");
        }else{
            System.out.println("not balanced string");
        }
    }
}
