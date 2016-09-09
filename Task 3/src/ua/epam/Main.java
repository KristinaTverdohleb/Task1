package ua.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //_________task 3.1
        //task_1
        System.out.print("\ntask_1\nEnter value: ");
        Scanner scan = new Scanner(System.in);
        int even_NotEven = 2;
        int a = scan.nextInt();

        if (a % even_NotEven == 0){
            System.out.println("even number");
        } else
            System.out.println("not even number");

        //________task 3.2
        System.out.print("\ntask2\nEnter value1 and value2: ");
        double value1 = scan.nextDouble();
        double value2 = scan.nextDouble();
        int border= 10;
        if ( (Math.abs(border - value1)) < (Math.abs(border - value2)) ){
            System.out.println("\nvalue1 closer " + " value1 = " + (Math.abs(border - value2)) + " value2 = " + (Math.abs(border - value2)));
        } else
            System.out.println("value2 closer " + " value1 = " + (Math.abs(border - value1)) + " value2 = " + (Math.abs(border - value2)));


        //_____task 3.3
        int min = 100;
        int max = 1000;
        int result = (int) (min + Math.random() * (max - min)) ;

        System.out.println("\ntask_3");

        if (result > max || result < min){
            System.out.println("error");
        } else
            System.out.println("result = " + result);

        int ten = 10;
        int sto  = result / min;
        int tmp = result % min;
        int desiat = tmp / ten;
        int odynad = tmp % ten;

        if ( sto > desiat && sto > odynad){
            System.out.println("max number = " + sto);
        } else
        if( desiat > sto && desiat > odynad){
            System.out.println("max number = " + desiat);
        } else
        if (sto == desiat || sto == odynad){
            System.out.println("max number  = " + sto);
        } else
        if (odynad == desiat || odynad == sto){
            System.out.println("max number = " + odynad);
        } else
        if (sto == desiat && desiat == odynad){
            System.out.println("max number = " + sto);
        }else
            System.out.println("max number = " + odynad);

    }
}
