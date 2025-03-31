package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_condenseArrayToNumber_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (nums.length > 1) {

            int[] condenseArray = new int[nums.length - 1];

            for (int i = 0; i < nums.length - 1; i++) {

                condenseArray[i] = nums[i] + nums[i + 1];
            }

            nums = condenseArray;

        }
        System.out.println(nums[0]);


    }
}
