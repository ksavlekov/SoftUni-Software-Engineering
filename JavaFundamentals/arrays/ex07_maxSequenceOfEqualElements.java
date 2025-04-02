package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07_maxSequenceOfEqualElements {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = reader.readLine().split(" ");

        int[] inputArray = new int[strNumbers.length];

        for (int w = 0; w < inputArray.length; w++) {
            inputArray[w] = Integer.parseInt(strNumbers[w]);
        }

        int count = 1;
        int maxLength = 1;
        int bestIndex = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]){
                count ++;
            }else{
                count = 1;
            }

            if (count > maxLength){
                maxLength = count;
                bestIndex = i + 1;
            }

        }

        int begin = Math.abs((bestIndex - maxLength) + 1);

        for (int e = begin; e < maxLength + begin; e++) {
            System.out.print(inputArray[e] + " ");
        }




    }
}
