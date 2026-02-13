import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;

public class ex02_simpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split("\\s+");

        ArrayDeque<String> calculator = new ArrayDeque<>();
        Collections.addAll(calculator, line);

        while (calculator.size() > 1){
            int firstNumber = Integer.parseInt(calculator.pop());
            String operator = calculator.pop();
            int secondNumber = Integer.parseInt(calculator.pop());

            switch (operator){
                case "+":

                    calculator.push(String.valueOf(firstNumber + secondNumber));

                    break;
                case "-":

                    calculator.push(String.valueOf(firstNumber - secondNumber));

                    break;
            }
        }

        System.out.println(calculator.pop());
    }
}
