import java.util.Scanner;

public class Mustaqil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=  ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        System.out.print("c= ");
        int c = scanner.nextInt();
        int x = 0;
        if (a != 0) {
            if ((1 <= a && a <= 100) && (1 <= b && b <= 100) && (1 <= c && c <= 100)) {
                int dickerminant = (int) (b*b) - 4 * a * c;
                int x1 = (int) ((-b) + Math.sqrt(dickerminant)) / 2 * a;
                int x2 = (int) ((-b) - Math.sqrt(dickerminant)) / 2 * a;
                if (x1 == 0 || x2 == 0) {
                    System.out.println("NO");
                }
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        } else {
            System.out.println("Exseption Throws");
        }

    }
}
