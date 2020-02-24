package org.fastrackit;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class siruri {


    public static void main (String args[]) throws IOException {
        siruri exercises = new siruri();
        siruri.prime();
        siruri.cmmdc();

        int a[] = { 12 , 1 , 12 , 3 , 12 , 1 , 1 , 2 , 3 , 2 , 2 , 3 , 7 };
        int n = a.length;
        System.out.println( "The element with single occurrence is " + getSingleNumber(a, n));

    }

    private static int getSingleNumber(int[] a, int n) {
        HashSet<Integer>  S= new HashSet<Integer>();
        for(int i:a){
            S.add(i);
        }
        int arr_sum=0;
        for (int i:a){
            arr_sum +=i;
        }
        int set_sum=0;
        for (int i:S){
            set_sum +=i;
        }
        return (3*set_sum-arr_sum)/2;

    }

    public static void prime() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("numarul n = ");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
        int i=2;
        boolean prim=true;
        while(i<=n/2)  {
            if(n%i==0) prim=false;
            i++;              }
        if(prim==true) System.out.println(n+" ESTE numar PRIM!");
        else System.out.println(n+" NU ESTE numar PRIM! ");
    }
    public static void cmmdc() throws IOException {
        InputStreamReader isr = new  InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("numarul n = ");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int i=1;
        while(i<=n) {
            if(n%i==0) System.out.print(i+", ");
            i++;      }

    }


}
