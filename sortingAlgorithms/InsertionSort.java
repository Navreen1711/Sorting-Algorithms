package sortingAlgorithms;

import java.util.Arrays;
//Insertion Sort
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={4,3,2,10,12,1,5,6};

        System.out.println("Insertion Sort\nInput:\n"+Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        System.out.println("Output:\n"+Arrays.toString(arr));
    }
}
