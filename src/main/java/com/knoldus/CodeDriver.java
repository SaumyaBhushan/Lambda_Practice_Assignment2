package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a long type of number");
        Long num = sc.nextLong();

        long even_num = Next_Even_No.operator.apply(num);
        System.out.println(even_num);
    }
}