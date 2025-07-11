package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03_printingTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        printTriangle(n);
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }

        for (int q = n - 1; q >= 1; q--) {
            printLine(1, q);
        }
    }
}
