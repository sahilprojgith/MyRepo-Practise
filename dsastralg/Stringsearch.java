package dtastructndalgo.dsastralg;

import java.util.Arrays;

public class Stringsearch {
    public static void main(String[] args) {
        String name = "Sahil";
        char target = 'a';
        System.out.println(search(name,target)); // search? here,
        //System.out.println(Arrays.toString(name.toCharArray()));
    }
    static  boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
    static  boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

       for(int i = 0;i<str.length();i++){
           if(target == str.charAt(i)){ // search a character - use charAt
               return true;
           }
       }
       return false;
    }
}
