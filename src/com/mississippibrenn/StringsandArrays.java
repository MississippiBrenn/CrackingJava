package com.mississippibrenn;



import java.util.*;

public class StringsandArrays {


    public boolean oneEditAway(String str1, String str2){
        HashMap<Character, Integer> HM = new HashMap<>();
        for(char ch:str1.toCharArray()){
            if(HM.get(ch) != null){
                int value = HM.get(ch);
                HM.put(ch, value +1);
            }else{
                HM.put(ch, 1);
            }
        }

        ArrayList<Character> charArray1 = new ArrayList<>();
        for(char ch2:str2.toCharArray()){
            if(HM.get(ch2) != null){

                int value2 = HM.get(ch2);
                if(value2 >1){
                    HM.put(ch2, value2-1);
                }else if(value2 ==1){
                    HM.remove(ch2);
                }
            }else{
                System.out.println("here " + ch2);

                charArray1.add(ch2);
            }
        }
        System.out.println(charArray1.size());

        System.out.println("******" + HM.size());
        return charArray1.size() + HM.size() <=1;
    }

    public boolean palindromPermutation(String string){
        if(string.length() == 1){return true;}
        HashMap<Character, Integer> HM = new HashMap<>();
        for (char ch:string.toCharArray()){
            if(HM.get(ch) != null){
                HM.put(ch, 1);
            }else{
                HM.remove(ch);
            }
        }
        if(HM.size()<=1){
            return true;
        }
        return false;
    }

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
