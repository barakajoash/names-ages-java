package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int length;
        Scanner input = new Scanner(System.in);
        System.out.println("How many names + age that your going to enter:");
        length = input.nextInt();

        String[] names = new String[length];
        int[] ages = new int[length];


        for(int counter=0; counter<length; counter++){
            System.out.println("Enter name"+(counter+1));
            names[counter] = input.next();
            System.out.println("Enter age:" +(counter+1));
            ages[counter] = input.nextInt();

        }
        input.close();
        System.out.println("Your names and ages are:");
        for (int counter=0; counter<length; counter++){
            System.out.println(names[counter]);
            System.out.println(ages[counter]);
        }
    }
}