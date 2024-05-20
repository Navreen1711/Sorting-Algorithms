package sortingAlgorithms;

import java.util.Arrays;

//Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,1,3,9,7};

        System.out.println("Selection Sort\nInput:\n"+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Output:\n"+ Arrays.toString(arr));

    }
}
