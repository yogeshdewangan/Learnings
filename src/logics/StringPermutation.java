package logics;

public class StringPermutation {

    public static void main(String[] args){
        permutationOfString("a b","");
    }

    public static void permutationOfString(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            String ros= str.substring(0,i)+str.substring(i+1);
            permutationOfString(ros, ans+ch);

        }
    }
}
