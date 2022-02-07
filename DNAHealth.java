package samsung;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class DNAHealth {
    public static void main(String[] args) throws IOException {

        int n = 6;

        List<String> genes = new ArrayList<>(
                Arrays.asList("a", "b", "c", "aa", "d", "b")
        );


        List<Integer> health = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6)
        );

        int s = 3;

        String[] firstMultipleInput = {"1", "5", "caaab"};


            int first = Integer.parseInt(firstMultipleInput[0]);

            int last = Integer.parseInt(firstMultipleInput[1]);

            String d = firstMultipleInput[2];

        int max = 0, min = 2147483647, sum=0, idx, i=0;
        IntStream.range(first, last).forEach(sItr -> {
        // for(int i=first; i<=last; i++){
            String g = genes.get(i);
            idx = 0;
            for (char j: d.toCharArray()){
                if(g.length() > 1){
                    String banding = "";
                    if(d.length() - idx >= g.length()) {
                        for (int k = 0; k < g.length(); k++) {
                            banding = banding + d.charAt(idx + k);
                        }
                        if (g.equals(banding)) sum = sum + health.get(i);
                    }
                } else if(g.equals(new String(new char[]{j}))) {
                    sum = sum + health.get(i);
                }
                idx++;
            }
        });

        System.out.println(sum + " "  +sum);

    }
}
