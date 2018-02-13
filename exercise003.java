package com.company;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //lab002 -exercise 03

        Scanner cube =new Scanner(System.in);

        double width,length,height;

        System.out.print("Enter Length    :");
        length=cube.nextDouble();

        System.out.print("Enter Width    :");
        width=cube.nextDouble();

        System.out.print("Enter Height    :");
        height=cube.nextDouble();

        double ans= length*width*height;

        //print result
        System.out.println("Volume of the cube      :"+ans);


    }
}
