package InterviewAltimetrikPaypal;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'modifyQueue' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY input
     *  2. INTEGER k
     */

    public static List<String> modifyQueue(List<String> input, int k) {
        /*List<String> first = input.subList(0, k);
        List<String> second = input.subList(k, input.size());

        Collections.reverse(first);
        first.addAll(second);*/

        return null;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int inputCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> input = new ArrayList<>();

        for (int i = 0; i < inputCount; i++) {
            String inputItem = bufferedReader.readLine();
            input.add(inputItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.modifyQueue(input, k);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

