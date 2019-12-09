package logics;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {1, 6, 3, 4, 9, 5, 2, 3};
        selectionSort(intArray);
    }

    public static void selectionSort(int[] intArray) {
        int temp, pos;

        for (int i = 0; i < intArray.length; i++) {
            pos = i;
            for (int j = i +1; j < intArray.length; j++) {
                if (intArray[pos] > intArray[j]) {
                    pos = j;
                }
            }
            temp=intArray[i];
            intArray[i]= intArray[pos];
            intArray[pos]=temp;
        }
        for(int i=0; i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }
    }
}
