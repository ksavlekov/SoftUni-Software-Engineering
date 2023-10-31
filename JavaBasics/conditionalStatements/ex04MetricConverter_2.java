import java.util.Scanner;

public class ex04MetricConverter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputMetricNumber = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric = scanner.nextLine();

        double convertedToMeter = 0;
        double convertedToOutputMetric = 0;

        if("m".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber;
        } else if ("mm".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber / 1000;
        } else if ("cm".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber / 100;
        } else if ("mi".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber / 0.000621371192;
        } else if ("in".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 39.3700787;
        } else if ("km".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber * 1000;
        } else if ("ft".equalsIgnoreCase(inputMetric)) {
            convertedToMeter = inputMetricNumber / 3.2808399;
        } else if ("yd".equalsIgnoreCase(inputMetric)){
            convertedToMeter = inputMetricNumber / 1.0936133;
        }


        if("m".equalsIgnoreCase(outputMetric)) {
            convertedToOutputMetric = convertedToMeter;
        } else if ("mm".equalsIgnoreCase(outputMetric)) {
            convertedToOutputMetric = convertedToMeter * 1000;
        } else if ("cm".equalsIgnoreCase(outputMetric)) {
            convertedToOutputMetric = convertedToMeter * 100;
        } else if ("mi".equalsIgnoreCase(outputMetric)) {
            convertedToOutputMetric = convertedToMeter * 0.000621371192;
        } else if ("in".equalsIgnoreCase(outputMetric)){
            convertedToOutputMetric = convertedToMeter * 39.3700787;
        } else if ("km".equalsIgnoreCase(outputMetric)) {
           convertedToOutputMetric = convertedToMeter / 1000;
        } else if ("ft".equalsIgnoreCase(outputMetric)) {
            convertedToOutputMetric= convertedToMeter * 3.2808399;
        } else if ("yd".equalsIgnoreCase(outputMetric)){
            convertedToOutputMetric = convertedToMeter * 1.0936133;
        }
        System.out.printf("%.8f", convertedToOutputMetric);
    }
}
