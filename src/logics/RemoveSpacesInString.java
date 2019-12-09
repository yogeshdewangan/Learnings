package logics;

public class RemoveSpacesInString {

    public static void main(String[] args){
        System.out.println(removeWhiteSpacesInString("ab ed rty dfd "));
    }

    public static String removeWhiteSpacesInString(String str){
        char[] ch_array= str.toCharArray();

        String strWithoutSpace="";

        for(int i =0 ; i< ch_array.length; i ++){
            if(ch_array[i]!='\t' && ch_array[i]!=' '){
                strWithoutSpace = strWithoutSpace+ ch_array[i];
            }
        }
        return strWithoutSpace;
    }
}
