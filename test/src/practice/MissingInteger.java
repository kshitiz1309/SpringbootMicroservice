package practice;

import java.util.*;

public class MissingInteger {
    public static void main(String[] args) {
        int[] number = {2,5,7,9,9,2,11,3,8,7};
        Set<Integer> hashset = new HashSet<>();
        for (int j : number)
            hashset.add(j);

        int highest = 0;
        for(int i : hashset){
            if(i>highest){
                highest= i;
            }
        }
        System.out.println(highest);
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<highest;i++){
            if (!hashset.contains(i)){
                list.add(i);
            }
        }
        System.out.println("Missing Integers : "+list);

    }
}
