package com.mississippibrenn;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StringsandArrays stringsandArrays = new StringsandArrays();
        LinkedList linkedlist = new LinkedList();
        int[][] input = {{1, 2}, {3, 4}};
        boolean answer = stringsandArrays.rotateMatrix(input);
        System.out.println(answer);

    }
}
