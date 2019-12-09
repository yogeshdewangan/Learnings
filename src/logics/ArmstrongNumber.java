package logics;

public class ArmstrongNumber {

    public static void main(String[] args){
        checkArmstrongNumber(153);
    }

    public static void checkArmstrongNumber(int num){
        int rem=0;
        int copyNum= num;
        int newNum =0;
        while(num!=0){
            rem= num % 10;
            newNum = newNum + rem*rem*rem;
            num = num /10;
        }
        if(newNum == copyNum){
            System.out.println("Number is an armstrong number");
        }
        else{
            System.out.println("Number is not an armstrong number");
        }
    }
}
