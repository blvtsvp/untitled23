package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int min  = Integer.MAX_VALUE;
        for(int i = 0; i < n;i++){
            a[i] = in.nextInt();
            if(a[i] < min) min = a[i];
        }
        for(int i = 0; i < n;i++){
            if(a[i] != min) {
                System.out.println(a[i]);
            }
        }

    }
}
