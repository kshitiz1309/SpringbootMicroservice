package practice;
import java.util.*;

public class LongestLength {
    public static void main(String[] args) {
        int[] arr = {15, 4, -2, 2, -3, 1, 3, 3, 0};
        int targetSum = 4;
        int n = arr.length;
        System.out.println("Length = " + lenOfLongSubarr(arr, n, targetSum));
    }
    static int lenOfLongSubarr(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k)
                maxLen = i + 1;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }
        return maxLen;
    }
}

