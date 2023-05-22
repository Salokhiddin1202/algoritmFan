import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Massiv1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n=");
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+i+"]=");
            array[i]=scanner.nextInt();

        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        Arrays.stream(array)
                .sorted()
                .forEach(System.out::println);
    }

}
