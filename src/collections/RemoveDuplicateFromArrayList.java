package collections;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {

    public static void main(String[] args){
        ArrayList<String> arrayList =new ArrayList<String>();

        arrayList.add("Yogesh");
        arrayList.add("Rajesh");
        arrayList.add("Yogesh");
        arrayList.add("Rajesh");
        arrayList.add("Archana");
        arrayList.add("Shruti");

        HashSet<String> hashSet =new HashSet<String>(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(arrayList);
    }
}
