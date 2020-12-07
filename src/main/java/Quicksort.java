package main.java;

import java.util.stream.IntStream;

public class Quicksort {


    public static void quicksort(int[]array,int lb,int ub)
    {
        if(lb>ub)
            return;
        int j = partition(array,lb,ub);
         quicksort(array,lb,j-1);
         quicksort(array,j+1,ub);
    }

    private  static int partition(int[] array, int lb, int ub) {
        int down = lb;
        int up = ub;
        int pivot = array[0];
        int temp=0;
        while(down<up)
        {
            while(array[down]<=pivot && down<ub)
                down++;
            while(array[up]>pivot)
                up--;
            if(down<up)
            {
                temp = array[up];
                array[up] = array[down];
                array[down] = array[up];
            }
        }

        array[lb] = array[up];
        array[up] = pivot;
        return up;


    }

    public static void main(String[] args) {
        int[]vals = {12,7,78,33,90,3,55,19};
        quicksort(vals,0,vals.length-1);
        IntStream.of(vals).forEach(System.out::println);
    }
}
