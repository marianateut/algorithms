package org.fastrackit;

public class Sorting {

    private void bubbleSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1; i++)
            for (int j=0; j<n-i-1; j++)
                if (arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
    }
    private void insertionSort(int arr[]){
        int n = arr.length;
        for (int i =1; i<n; i++){
            int key=arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
                arr[j+1]=key;}
        }
    }

    private void selectionSort(int arr[]){
       int n= arr.length;
       for(int i=0;i<n;i++) {
           int min_idx = i;
           for (int j = i + 1; j < n; j++)
               if (arr[j] < arr[min_idx])
                   min_idx=j;
               int temp= arr[min_idx];
               arr[min_idx]=arr[i];
               arr[i]=temp;
       }
    }

    private void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main (String args[]){

        int arr[]={12,11,13,5,6};
        int n=arr.length;
        Sorting ob = new Sorting();
        ob.bubbleSort(arr);
        System.out.println("Bubble sort e:");
        ob.printArray(arr);

        int a[]={30,10,14,18,35,2};
        int m=a.length;
        ob.insertionSort(a);
        System.out.println("insertion sort:");
        ob.printArray(a);

        int b[]={14,33,27,35,10,19,42,44};
        int x=b.length;
        ob.selectionSort(b);
        System.out.println("Selection sort:");
        ob.printArray(b);
    }
}

