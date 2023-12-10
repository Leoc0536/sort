package com.hkbu.life;

import java.util.ArrayList;
import java.util.Arrays;

public class bubble {
    public ArrayList<Integer> l;

    public static void sort(ArrayList<Integer> l){
        System.out.println("before sorting: "+ l);
        for (int i = l.size()-1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (l.get(j) > l.get(j + 1)) {
                    int j_value = l.get(j);
                    l.remove(j);
                    l.add(j + 1, j_value);
                }
            }
        }
        System.out.println("After sorting: "+l);
    }
    public static void sort(int[] l){
        System.out.println("before sorting: "+Arrays.toString(l));

        for (int i = l.length-1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (l[j] > l[j + 1]) {
                    int temp = l[i];
                    l[i] = l[j];
                    l[j] = temp;
                }
            }
        }
        System.out.println("After sorting: "+Arrays.toString(l));
    }
    public static void main(String[] args) {
        // TIME COMPLEXITY = O(n^2)

        ArrayList<Integer> l = new ArrayList<>();
        l.add(40);
        l.add(50);
        l.add(30);
        l.add(20);
        l.add(10);
        bubble.sort(l);


        System.out.println("____Array approach____");
        int[] l_two = {40, 50, 30, 20, 10};
        sort(l_two);
    }
}

