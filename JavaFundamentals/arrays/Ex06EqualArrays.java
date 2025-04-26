import java.util.Arrays;
import java.util.Scanner;

public class Ex06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arrayOne = getInts(scanner);

        int[] arrayTwo = getInts(scanner);

//        System.out.println(Arrays.toString(arrayOne));
//        System.out.println(Arrays.toString(arrayTwo));

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arrayOne.length; i++){
            if (arrayOne[i] == arrayTwo[i]){

                sum += arrayOne[i];
                count++;
            } else {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                break;
            }
        }

        if (count == arrayOne.length) {
            System.out.println(String.format("Arrays are identical. Sum: %d", sum));
        }

    }

    public static int[] getInts(Scanner scanner) {
        String[] inputArrayOne = scanner.nextLine().split(" ");
        int[] arrayOne = new int[inputArrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = Integer.parseInt(inputArrayOne[i]);

//            System.out.print(arrayOne[i] + " ");
        }
        return arrayOne;
    }
}
