package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return x -> {
            List<Integer> res = new ArrayList<>();

            for (int i=0; i<x.size(); i++) {
                res.add(x.get(i)/divider);
            }

            return res;
        };
    }
//    public static void main(String[] args) {
//        InterfaceCreator ic = new InterfaceCreator();
//        List<Integer> list = new ArrayList<>();
//        list.add(9);
//        list.add(12);
//        list.add(15);
//        list.add(999);
//        list.add(30);
//
//        System.out.println(ic.divideBy(3).apply(list));
//    }
}
