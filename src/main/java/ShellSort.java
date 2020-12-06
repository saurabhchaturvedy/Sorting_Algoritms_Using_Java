package main.java;

import java.util.stream.IntStream;

public class ShellSort {

    public static void main(String[] args) {
        int[]vals = {58,80,88,45,9,17,93,20,51,67};
        int n = vals.length;
        int current = 0;
        int j=0;
        for(int gap = n/2; gap>=1; gap=gap/2)
        {

            for(int i=gap; i<n; i++)
            {
                current = vals[i];
                for(j=i; j>=gap && current<vals[j-gap]; j=j-gap )
                {
                    vals[j] = vals[j-gap];
                }
                vals[j] = current;
            }
        }

        IntStream.of(vals).forEach(System.out::println);
    }
}
