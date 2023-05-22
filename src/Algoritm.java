import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a qiymatni kiriting = ");
        double a=scanner.nextInt();
        System.out.print("b qiymatni kiriting = ");
        double b=scanner.nextInt();
        System.out.print("c qiymat  kiriting  = ");
        double c=scanner.nextInt();
        double peremetr=(a+b+c)/2;
        System.out.println("Peremetr yarmi Geron formula uchun = "+peremetr);
        double sum=peremetr*(peremetr-a)*(peremetr-b)*(peremetr-c);
        double yuza=Math.pow(sum,2);
        System.out.println("Uchburchakni yuzasi Geron formulasi yordamida topildi = "+yuza);
    }
}
