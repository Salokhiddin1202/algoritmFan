import java.util.Scanner;

public class azamat7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" X qiymatini kiriting  = ");
        int a = scanner.nextInt();
        int yigindi = 0;
        for (int i = 0; i <= a; i++) {
            if (a != 0) {
                System.out.println("sonlar = "+i);
                System.out.println(yigindi += i);
            }else{
                System.out.println("0 ga teng");
            }

        }
    }
}
