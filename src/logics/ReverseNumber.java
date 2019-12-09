package logics;

public class ReverseNumber {

    public static void main (String[] args){
        Integer num = 123;
        Integer newNum =0;
        while(num!=0) {
            Integer rem = num % 10;
            newNum =newNum*10 + rem;
            num = num/10;
        }
        System.out.println(newNum.toString());

    }
}
