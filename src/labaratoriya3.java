import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class labaratoriya3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.print("Qiymatni kiriting n=");
        n = scanner.nextInt();
        System.out.print("Qiymatni kiriting m=");
        m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0;i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array[" + i + "][" + j + "]=");
                array[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        for (
                int i = 0;
                i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }

        }

        System.out.println("Qiymat = " + sum);
    }
}
