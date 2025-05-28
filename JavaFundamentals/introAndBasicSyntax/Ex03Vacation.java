import java.util.Scanner;

public class Ex03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();


        double studentsFriday = group * 8.45;
        double studentsSaturday = group * 9.80;
        double studentsSunday = group * 10.46;

        double businessFriday = group * 10.90;
        double businessSaturday = group * 15.60;
        double businessSunday = group * 16.00;

        double regularFriday = group * 15.00;
        double regularSaturday = group * 20.00;
        double regularSunday = group * 22.50;

        switch (dayOfWeek) {
            case "Friday":
                switch (typeOfGroup) {
                    case "Students":
                        if (group >= 30) {
                            double discountStudentsFriday = studentsFriday - (studentsFriday * 0.15);
                            System.out.printf("Total price: %.2f", discountStudentsFriday);
                        } else {
                            System.out.printf("Total price: %.2f", studentsFriday);
                        }
                        break;
                    case "Business":
                        if (group >= 100) {
                            double discountBusinessFriday = (group - 10) * 10.90;
                            System.out.printf("Total price: %.2f", discountBusinessFriday);
                        } else {
                            System.out.printf("Total price: %.2f", businessFriday);

                        }
                        break;
                    case "Regular":
                        if ((group >= 10) && (group <= 20)) {
                            double discountRegularFriday = regularFriday - (regularFriday * 0.05);
                            System.out.printf("Total price: %.2f", discountRegularFriday);
                        } else {
                            System.out.printf("Total price: %.2f", regularFriday);
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (typeOfGroup) {
                    case "Students":
                        if (group >= 30) {
                            double discountStudentsSaturday = studentsSaturday - (studentsSaturday * 0.15);
                            System.out.printf("Total price: %.2f", discountStudentsSaturday);
                        } else {
                            System.out.printf("Total price: %.2f", studentsSaturday);
                        }
                        break;
                    case "Business":
                        if (group >= 100) {
                            double discountBusinessSaturday = (group - 10) * 10.90;
                            System.out.printf("Total price: %.2f", discountBusinessSaturday);
                        } else {
                            System.out.printf("Total price: %.2f", businessSaturday);

                        }
                        break;
                    case "Regular":
                        if ((group >= 10) && (group <= 20)) {
                            double discountRegularSaturday = regularSaturday - (regularSaturday * 0.05);
                            System.out.printf("Total price: %.2f", discountRegularSaturday);
                        } else {
                            System.out.printf("Total price: %.2f", regularSaturday);
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (typeOfGroup) {
                    case "Students":
                        if (group >= 30) {
                            double discountStudentsSunday = studentsSunday - (studentsSunday * 0.15);
                            System.out.printf("Total price: %.2f", discountStudentsSunday);
                        } else {
                            System.out.printf("Total price: %.2f", studentsSunday);
                        }
                        break;
                    case "Business":
                        if (group >= 100) {
                            double discountBusinessSunday = (group - 10) * 10.90;
                            System.out.printf("Total price: %.2f", discountBusinessSunday);
                        } else {
                            System.out.printf("Total price: %.2f", businessSunday);
                        }
                        break;
                    case "Regular":
                        if ((group >= 10) && (group <= 20)) {
                            double discountRegularSunday = regularSunday - (regularSunday * 0.05);
                            System.out.printf("Total price: %.2f", discountRegularSunday);
                        } else {
                            System.out.printf("Total price: %.2f", regularSunday);
                        }
                        break;
                }
                break;
        }
    }
}
