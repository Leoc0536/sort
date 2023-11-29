package com.hkbu.life;

import java.util.ArrayList;
import java.util.List;

public class insert {
    public ArrayList<Integer> l;
    public static void sort(ArrayList<Integer> l){
        System.out.println("before sorting: "+ l);

        for (int i = 1; i < l.size(); i++) {
            for (int j=0;j<i;j++){
                if (l.get(j) > l.get(i)){
                    int i_value = l.get(i);
                    l.remove(i);
                    l.add(j,i_value);
                }
            }
        }
        System.out.println("After sorting: "+l);
    }
    public static void main(String[] args) {
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
    }
}
