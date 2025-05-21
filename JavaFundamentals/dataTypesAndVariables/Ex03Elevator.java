import java.util.Scanner;

public class Ex03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int course = 0;

        if (numOfPeople % capacity == 0) {

            int output = numOfPeople / capacity;
//            System.out.println(String.format("%d courses * %d people", output, capacity));
            System.out.println(output);

        } else if (capacity > numOfPeople) {

            int output2 = capacity / numOfPeople;
//            System.out.println("All the persons fit inside in the elevator.\n" +
//                    "Only one course is needed.");
            System.out.println(output2);
        } else {

            int output3 = numOfPeople / capacity;
            double output4 = numOfPeople % capacity;

//            course++;

//            System.out.printf("%.0f courses * %d people\n" +
//                    "+ %d course * %.0f persons\n", output3, capacity, course, output4);
            System.out.println(String.format("%d", output3));
        }

    }
}