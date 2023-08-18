import com.sun.javafx.tools.resource.ResourceFilter;

import java.util.Scanner;

public class ex04TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double widht = Double.parseDouble(scanner.nextLine());

        double areaTableCentre = tables * (lenght /2 ) * (lenght / 2);
        double areaCover = tables *(lenght + 2 * 0.30) * (widht + 2 * 0.30);

        double bothUSD = (areaTableCentre * 9) + (areaCover * 7);
        double bothLeva = bothUSD * 1.85;

        System.out.printf("%.2f USD\n", bothUSD);
        System.out.printf("%.2f BGN", bothLeva);
    }
}
