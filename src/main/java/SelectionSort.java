package main.java;

import java.util.stream.IntStream;

public class SelectionSort {

    public static void main(String[] args) {
        int[]vals = {40,80,20,10,7};
        int n = vals.length;
        int temp=0;

        for(int i=0; i<n-1; i++)
        {
            int min_index=i;
            for(int j=i+1; j<n; j++)
            {
                if(vals[j]<vals[min_index])
                {
                    min_index = j;
                }
            }

            if(min_index!=i)
            {
                temp = vals[min_index];
                vals[min_index] = vals[i];
                vals[i] = temp;
            }
        }

        IntStream.of(vals).forEach(System.out::println);

    }
}
