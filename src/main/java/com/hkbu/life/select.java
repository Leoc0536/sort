package com.hkbu.life;

import java.util.ArrayList;
import java.util.Arrays;

public class select {

    public ArrayList<Integer> l;
    public static void sort(ArrayList<Integer> l){
        System.out.println("before sorting: "+ l);

        for (int i = 0; i < l.size()-1; i++) {
            int min_index = i;
            int j_value;
            for (int j = i + 1; j < l.size(); j++) {
                j_value = l.get(j);
                if (l.get(min_index) > j_value){min_index=j;}
            }
            int min_value = l.get(min_index);
            int swap_value = l.get(i);
            l.remove(min_index);
            l.remove(i);
            l.add(i, min_value);
            l.add(min_index, swap_value);
        }
        System.out.println("After sorting: "+l);
    }

    public static void sort(int[] l){
        System.out.println("before sorting: "+ Arrays.toString(l));

        for (int i = 0; i < l.length-1; i++) {
            int min_index = i;
            for (int j = i + 1; j < l.length; j++) {
                if (l[min_index] > l[j]){min_index=j;}
            }
            int temp = l[min_index];
            l[min_index] = l[i];
            l[i] = temp;
        }
        System.out.println("After sorting: "+Arrays.toString(l));
    }
    public static void main(String[] args) {
        // TIME COMPLEXITY = O(n^2)

        ArrayList<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(29);
        l.add(25);
        l.add(8);
        l.add(32);
        l.add(17);
        l.add(40);
        sort(l);

        System.out.println("____Array approach____");
        int[] l_two = {12, 29, 25, 8, 32, 17, 40};
        sort(l_two);
    }
}