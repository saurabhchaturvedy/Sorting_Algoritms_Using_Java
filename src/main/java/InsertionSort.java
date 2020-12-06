package main.java;

import java.util.stream.IntStream;

public class InsertionSort {

    public static void main(String[] args) {
        int[]vals = {40,30,20,50,35};
        int n = vals.length;
        int current = 0;
        int j =0;
        for(int i=1; i<n; i++)
        {
            current = vals[i];
            for (j=i-1; j>=0 && current < vals[j]; j--)
            {
                vals[j+1] = vals[j];
            }

            vals[j+1] = current;
        }
        IntStream.of(vals).forEach(System.out::println);
    }

}
