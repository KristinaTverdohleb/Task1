package ua.epam;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //____________task 2.1
        System.out.println("task 1");
        int value1 = 42;
        int value2 = 42 / 10;
        int value3 = 42 % 10;
        int value4 = value2 + value3;
        System.out.println("function2 = "+ value4);

        //_____________task 2.2
        System.out.println("task 2");
        int value5 = 546;
        int value6 = 546 / 100;
        int value7 = 46 / 10;
        int value8 = 46 % 10;
        int value9 = value6 + value7 + value8;
        System.out.println("function3 = "+ value9);

        //___________task 2.3
        System.out.println("task 3");
        Scanner scan = new Scanner(System.in);

        System.out.println("Input q");
        int q = scan.nextInt();;
        int s = q / 10;
        int p = q % 10;
        int valuef = s + p;
        System.out.println("answer = " + valuef);

        System.out.println("task 4");
        //__________task 2.4
        double a = 5.5;
        double b = (Math.round(a));
        System.out.println("result " + b);

     //________task 2.5
        System.out.println("task 5");
        double k = 8.5;
        double n = (Math.round(k));
        System.out.println("result " + n);
    }
}
