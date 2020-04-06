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
        System.out.println( "The element with single occurrence is:" + getSingleNumber(a, n));

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int m = arr.length;
        bubbleSort(arr, m);
        System.out.println("Sorted array: ");
        printArray(arr, m);

    }

    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public  static void bubbleSort(int arr[], int m) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < m - 1; i++) {
            swapped = false;
            for (j = 0; j < m - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
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
