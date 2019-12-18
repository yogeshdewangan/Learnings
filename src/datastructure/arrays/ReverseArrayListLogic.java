package datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayListLogic {

    static List<Integer> reverseAList(List<Integer> list){

        for(int i=0, j=list.size()-1; i<list.size()/2; i++, j--){
            int temp=list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        return list;
    }

    public static void main(String[] args){
        List<Integer> list= new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        System.out.println(reverseAList(list));
    }




}
