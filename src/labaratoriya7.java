import java.util.Scanner;

public class labaratoriya7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" X qiymatini kiriting (kg) = ");
        int a= scanner.nextInt();
        System.out.print(" Y qiymatini kiriting (so'm da) = ");
        int b= scanner.nextInt();
        int sum=0;
            for (int i=0;i<a;i++){
                 sum=a*b;
            }
        System.out.println("Yig'indi so'mma = "+sum);
        }
    }

