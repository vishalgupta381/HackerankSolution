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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
        int plus = 0;
        int minus = 0;
        int zero = 0;
        
        DecimalFormat df = new DecimalFormat("#.######");
        
        for(int num : arr) {
            if(num > 0) plus++;
            else if(num < 0) minus++;
            else zero++;
        }
        
        System.out.printf("%.6f\n", (plus*1.0f)/arr.size());
        System.out.printf("%.6f\n", (minus*1.0f)/arr.size());
        System.out.printf("%.6f", (zero*1.0f)/arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
