package com.coderscampus.arraylist;

public class Main{
    public static void main(String[] args) {

        CustomList<Integer> customList = new CustomArrayList();
        customList.add(1);
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.add(5);
        customList.add(6);
        customList.add(7);
        customList.add(8);
        customList.add(9);

        System.out.println(customList.get(9));

    }
}