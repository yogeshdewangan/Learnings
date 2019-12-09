package logics;

import java.util.*;

public class ReverseEachWordInString {

    public static void main(String[] args) {
        reverseEachWordInString();
    }

    public static void reverseEachWordInString(){
        String str= "I Love My India";
        String[] list = str.split(" ");
        StringBuffer stringBuffer= new StringBuffer();
        for(String word: list){
            char[] ch_word=word.toCharArray();
            for(int i=ch_word.length-1; i >=0; i--){
                stringBuffer.append(ch_word[i]);
            }
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer.toString());
    }
}
