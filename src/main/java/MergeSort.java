package main.java;

import java.util.stream.IntStream;

public class MergeSort {



    private static void mergesort(int[]arr,int[]temp,int lb,int ub)
    {
        if(lb>=ub) return;
        int mid = (lb+ub)/2;
        mergesort(arr,temp,lb,mid);
        mergesort(arr,temp,mid+1,ub);
        merge(arr,temp,lb,mid,ub);
    }

    private static void merge(int[] array,int [] temp, int lb, int mid, int ub) {
        int i, j, k;
        for(i = lb, j = mid+1, k = lb; i <= mid && j <= ub; ++k){
            if (array[i] <= array[j]){
                temp[k] = array[i];
                i++;
            }
            else {
                temp[k] = array[j];
                j++;
            }
        } // end of for
        // copy the additional elements, if any there in the sorted sections
        while(i <= mid){
            temp[k] = array[i];
            k++; i++;
        }

        while(j <= ub){
            temp[k] = array[j];
            k++; j++;
        }

        // finally copy back the merged sorted numbers from temp to array
        for(i = lb; i <= ub; ++i){
            array[i] = temp[i];
        }

    }



    public static void main(String[] args) {
        int[]vals = {31,12,45,20,10,22,30,15,2};
        int[]temp = new int[vals.length];
        mergesort(vals,temp,0,vals.length-1);
        IntStream.of(vals).forEach(System.out::println);
    }
}
