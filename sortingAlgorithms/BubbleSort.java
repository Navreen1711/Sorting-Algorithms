package sortingAlgorithms;
//bubble sort

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[]={36,41,4,17,48,50,44,45,26,40,39};

        boolean b=true;

        int j=0;
        System.out.println("Bubble Sort\nInput:\n"+Arrays.toString(arr));
        do{
            b=false;
            for(int i=0;i<arr.length-1-j;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    b=true;
                }
            }
            j++;
        }while(b);
        System.out.println("Output:\n"+Arrays.toString(arr));

    }
}
