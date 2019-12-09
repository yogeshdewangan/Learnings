package logics;

public class SecondLargestNumberInArray {
    public static void main(String[] args){
        int[] numArray= {2,5,7,1,4,9,8};
        System.out.println(getSecondLargestNumberInArray(numArray));
    }

    public static int getSecondLargestNumberInArray(int[] numArray){
        int firstLargest=0;
        int secondLargest=0;

        if (numArray[0] >numArray[1]){
            firstLargest=numArray[0];
            secondLargest=numArray[1];
        }
        else {
            firstLargest=numArray[1];
            secondLargest=numArray[0];
        }

        for(int i =2; i< numArray.length;i++){
            if (numArray[i]>firstLargest){
                firstLargest=numArray[i];
            }
            if(numArray[i]<firstLargest && numArray[i]>secondLargest){
                secondLargest=numArray[i];
            }

        }
        return secondLargest;

    }
}
