package practice;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str1 = "abcdABCDabcdABCD";
        String str2 ="";
        for(int i =0;i<str1.length();i++){
            if(!(str1.charAt(i)=='a' || str1.charAt(i)=='A')){
                str2 = str2 + str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
