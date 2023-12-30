// Implementing the concept of merge sot

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] array  = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = scan.nextInt();
		}
		
		int fidx = 0;
		int lidx = array.length - 1;
		
		System.out.println("Your array: " + Arrays.toString(array));
		System.out.println("Sorting...");
		sort(array, fidx, lidx);
		System.out.println("Sorted: " + Arrays.toString(array));
	}
	public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1+ j];
        }
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);
 
            merge(arr, l, m, r);
        }
        System.out.println("Sorting... " + Arrays.toString(arr));
    }
}
