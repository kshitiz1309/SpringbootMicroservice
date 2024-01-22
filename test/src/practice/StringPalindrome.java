package practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "ksk";
        String reverseString = "";
        for(int i = string.length()-1;i>=0;i--){
            reverseString = reverseString + string.charAt(i);
        }
        if(string.equals(reverseString)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }

}
