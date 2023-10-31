import java.util.Scanner;

public class ex03_SpeedInfo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double inputSpeed = Double.parseDouble(scanner.nextLine());

        if (inputSpeed <= 10){
            System.out.println("slow");
        }else if(inputSpeed > 10 && inputSpeed <= 50){
            System.out.println("average");
        }else if (inputSpeed > 50 && inputSpeed <= 150){
            System.out.println("fast");
        }else if(inputSpeed > 1000){
            System.out.println("extremely fast");
        }else{
            System.out.println("ultra fast");
        }



    }
}
