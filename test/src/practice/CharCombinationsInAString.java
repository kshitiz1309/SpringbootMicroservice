package practice;

public class CharCombinationsInAString {
    public static void main(String[] args) {
        String s = "ABCDEF";
        generateCombinations(s, "", 0);
    }
    private static void generateCombinations(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        // Include the current character in the combination
        generateCombinations(s, current + s.charAt(index), index + 1);

        // Exclude the current character from the combination
        generateCombinations(s, current, index + 1);
    }
}
