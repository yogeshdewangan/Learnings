package logics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        for (int i=0; i < i1;i++) {
            System.out.println(fibonacciSeries(i));
        }
    }

    //fibonacci series
    public static Integer fibonacciSeries(Integer num){
        if (num ==0){
            return 0;
        }
        if (num ==1 || num == 2){
            return 1;
        }

        return (fibonacciSeries(num-2)+ fibonacciSeries(num-1));
    }

}
