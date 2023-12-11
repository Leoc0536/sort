package com.hkbu.life;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insert {
    public ArrayList<Integer> l;
    public static void sort(ArrayList<Integer> l){
        System.out.println("before sorting: "+ l);

        for (int i = 1; i < l.size(); i++) {
            int key = l.get(i);
            int j = i - 1;
            while (j>=0 && l.get(j)>key){
                l.set(j+1, l.get(j));
                j -= 1;
            }
            l.set(j+1, key);

//            for (int j=0;j<i;j++){
//                if (l.get(j) > l.get(i)){
//                    int i_value = l.get(i);
//                    l.remove(i);
//                    l.add(j,i_value);
//                }
//            }
        }
        System.out.println("After sorting: "+l);
    }
    public static void sort(int[] l){
        System.out.println("before sorting: "+ Arrays.toString(l));

        for (int i = 1; i < l.length; i++) {
            for (int j=0;j<i;j++){
                if (l[j] > l[i]){
                    int temp = l[i];
                    l[i] = l[j];
                    l[j] = temp;
                }
            }
//            int key = l[i];
//            int j = i-1;
//            while (j>=0 && l[j]>key){
//                l[j+1] = l[j];
//                j -= 1;
//            }
//            l[j+1] = key;
        }
        System.out.println("After sorting: "+Arrays.toString(l));
    }

    public static void main(String[] args) {
        // worst case: O(n^2)
        // best case: O(n)
        ArrayList<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(10);
        l.add(12);
        l.add(1);
        l.add(5);
        l.add(6);
        insert.sort(l);

        System.out.println("____Array approach____");
        int[] l_two = {4, 3, 2, 10, 12, 1, 5, 6};
        sort(l_two);
    }
}
