package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        String num = sc.nextLine();

        Next_Even_No next_even_no = new Next_Even_No();
        long even_num = next_even_no.CalcNextEvenNum(num);
        System.out.println(even_num);
    }
}