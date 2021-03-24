package com.mississippibrenn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Character> answer = replace20("ab c ");
        System.out.println(answer);
    }

    // Chapter 1

    public static List<Character> replace20(String str1){

        char [] temp = str1.toCharArray();
        List<Character> finalList = new ArrayList<Character>();
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == ' '){
                finalList.add('%');
                finalList.add('2');
                finalList.add('0');
            }else{
                finalList.add(temp[i]);
            }
        }

        return finalList;
    }



    public static boolean isPermutation(String str1, String str2){
        if(str1.length() != str2.length() ){
            return false;
        }
        HashMap<Character, String> dict = new HashMap<Character, String>();
        for(int i =0; i<str1.length(); i++){
            dict.put(str1.charAt(i), "aa");
        }
        for(int j =0; j<str2.length(); j++){
            dict.remove(str2.charAt(j));
        }

        if(dict.size() > 0){
            return false;
        }

        return true;
    }

    public static boolean isUnique(String str1) {
        //assign to dictionary and check length
        HashMap<Character, String> str1Dict = new HashMap<Character, String>();
       for(int i =0; i<str1.length(); i++){
           str1Dict.put(str1.charAt(i), "aa");

       }
        return str1.length() == str1Dict.size();
    }

    public static boolean isUnique2 (String args) {
         char tempArray[] = args.toCharArray();
        Arrays.sort(tempArray);

        for(int i = 0; i< tempArray.length -2; i++){
            if (tempArray[i] == tempArray[i+1]){
            return false;
            }
        }
        return true;

    }
}
