package logics;

public class ReverseAString {

    public static void main(String[] args){
        System.out.println(reverseAString("abcd"));
    }

    public static String reverseAString(String str){
        char[] ch_str= str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=ch_str.length-1; i>=0;i--){
            stringBuffer.append(ch_str[i]);
        }
        return stringBuffer.toString();
    }
}
