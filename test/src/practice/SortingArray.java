package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){
        int[] arr = {2,5,3,8,6,1,9,7};
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.println(i);
    }
}
