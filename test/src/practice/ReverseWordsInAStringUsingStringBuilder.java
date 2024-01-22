package practice;

public class ReverseWordsInAStringUsingStringBuilder {
    public static void main(String[] args) {
        String s ="fajita hai";
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder(s1[0]).reverse();
        StringBuilder sb2 = new StringBuilder(s1[1]).reverse();
        String s3 = sb +" "+ sb2;
        System.out.println("Reversed Words : "+s3);

        System.out.println("Reversed Words : "+sbAppend(s));
    }

    public static String sbAppend(String str){
        String[] s1 = str.split(" ");
        char[] c = s1[0].toCharArray();
        char[] c2 = s1[1].toCharArray();
        StringBuilder out = new StringBuilder();
        StringBuilder out2 = new StringBuilder();
        for(int i = c.length-1;i>=0;i--){
           out.append(c[i]);
        }
        for(int i = c2.length-1;i>=0;i--){
            out2.append(c2[i]);
        }
        return out+" "+out2;
    }
}
