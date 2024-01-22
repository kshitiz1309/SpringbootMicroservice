package practice;

public class Palindrome {
    public static void main(String[] args) {
        int number = 121;
        if(isPalindrome(number)){
            System.out.println("Integer is Palindrome");
        }else{
            System.out.println("Integer is not palindrome");
        }
    }

    static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        while (number>0){
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number = number / 10;
        }
        return originalNumber == reversedNumber;
    }
}
