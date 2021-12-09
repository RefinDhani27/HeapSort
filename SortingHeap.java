/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author REFIN
 */
public class SortingHeap {
    
    public void sort(int data[]) {
        
        int n = data.length;
  
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(data, n, i);
  
        for (int i=n-1; i>=0; i--)
        {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            heapify(data, i, 0);
        }
    }
  
    void heapify(int data[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
        if (l < n && data[l] > data[largest])
            largest = l;
  
        if (r < n && data[r] > data[largest])
            largest = r;
  
        if (largest != i)
        {
            int swap = data[i];
            data[i] = data[largest];
            data[largest] = swap;
            heapify(data, n, largest);
        }
    }
  
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Data : ");
        int jml_data = scan.nextInt();
        
        int[] data = new int[jml_data];
        int n = data.length;
        
        System.out.println();
        for(int a = 0; a < jml_data; a++) {
            System.out.print("Nilai data ke-"+(a+1)+" : ");
            data[a] = scan.nextInt();
        }
        System.out.println();
        
        System.out.println("Sebelum di Urutkan Heap Sort ");
        for(int i = 0; i < jml_data; i++)
        {
           System.out.print(data[i]+" ");
        }
        
        SortingHeap ob = new SortingHeap();
        ob.sort(data);
        System.out.println();
  
        System.out.println("Setelah di Urutkan Heap Sort");
        printArray(data);
    }
}
