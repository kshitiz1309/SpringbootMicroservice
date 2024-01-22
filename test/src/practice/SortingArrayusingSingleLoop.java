package practice;

import java.util.Arrays;

public class SortingArrayusingSingleLoop {
    public static void main(String[] args){
        int[] arr = {2,5,3,8,6,1,9,7};
        for (int i = 0; i < arr.length * arr.length; i++) {
            int index_i = i / arr.length;
            int index_j = i % arr.length;
            if (arr[index_i] < arr[index_j]) {
                int temp = arr[index_i];
                arr[index_i] = arr[index_j];
                arr[index_j] = temp;
            }
        }
        for (int i : arr)
            System.out.println(i);
    }
}
