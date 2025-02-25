import java.util.Scanner;

public class Ex07_WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int glassVolume = Integer.parseInt(scanner.nextLine());
        int totalSpilled = 0;

        int count = 1;
        while(count < 100){
            String mode = scanner.nextLine();
            if(mode.equals("Easy")){
                totalSpilled += 50;
            }
            else if(mode.equals("Medium")){
                totalSpilled += 100;
            }
            else if(mode.equals("Hard")){
                totalSpilled += 200;
            }

            if(totalSpilled > glassVolume){
                System.out.printf("%dml has been spilled.",totalSpilled-glassVolume);
                break;
            }
            else if(totalSpilled == glassVolume){
                System.out.printf("The dispenser has been tapped %d times.",count);
                break;
            }
            count++;
        }

    }
}