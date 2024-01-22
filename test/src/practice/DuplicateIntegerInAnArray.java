package practice;

import java.util.*;

public class DuplicateIntegerInAnArray {
    public static void main(String[] args){
        int[] number = {2,6,9,11,13,13,9};
        Map<Integer,Integer> hm1= new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : number){
            if(hm1.containsKey(i)){
                list.add(i);
            }else{
                hm1.put(i,1);
            }
        }
        System.out.println("Duplicate Integers : "+list);


    }
}