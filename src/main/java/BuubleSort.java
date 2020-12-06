package main.java;

import java.util.stream.IntStream;

public class BuubleSort {

    public static void main(String[] args) {
        int[]vals = {40,80,20,10,7};
        int n=vals.length;
        int temp=0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(vals[j]>vals[j+1])
                {
                    temp = vals[j];
                    vals[j] = vals[j+1];
                    vals[j+1] = temp;
                }
            }
        }

        IntStream.of(vals).forEach(System.out::println);
    }
}
