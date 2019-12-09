package logics;

public class BubbleSort {

    public static void main(String[] args){
bubbleSort();

    }

    public static void bubbleSort(){
        int[] inArray={2,5,4,3,7,1,3,8,5,9};

        for(int i=0; i < inArray.length; i++){
            for (int j=0; j<inArray.length; j++){
                if(inArray[i]<inArray[j]){
                    int temp=inArray[i];
                    inArray[i]=inArray[j];
                    inArray[j]=temp;
                }
            }
        }

        for(int i=0; i < inArray.length; i++){
            System.out.println(inArray[i]);
        }
    }
}
