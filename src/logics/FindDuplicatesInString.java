package logics;

import java.util.HashMap;

public class FindDuplicatesInString {
    public static void main(String[] args){
        System.out.println(findDuplicatesInAString("anbcgdabndfgcteuudhgjfj"));
    }

    public static String findDuplicatesInAString(String str){
        char[] chArray = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(int i =0; i<chArray.length ; i++){
            if(hashMap.containsKey(chArray[i])){
                hashMap.put(chArray[i], hashMap.get(chArray[i])+1);

            }
            else
            {
                hashMap.put(chArray[i], 1);
            }
        }
        return hashMap.toString();

    }
}
