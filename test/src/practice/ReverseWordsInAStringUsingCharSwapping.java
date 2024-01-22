package practice;

public class ReverseWordsInAStringUsingCharSwapping {
    public static void main(String[] args) {
        String s ="fajita hai";
        String[] s1 = s.split(" ");

        char[] c = s1[0].toCharArray();
        char[] c2 = s1[1].toCharArray();
        String reversedWords = reverseString(c,c.length-1).concat(" "+reverseString(c2,c2.length-1));
        System.out.println("Reversed string using character array : "+ reversedWords);
    }

    static String reverseString(char[] c,  int end){
        int start = 0;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return new String(c);
    }
}
