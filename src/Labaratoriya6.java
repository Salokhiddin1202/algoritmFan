import java.util.Scanner;

public class Labaratoriya6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(" X qiymatini kiriting = ");
        int x= scanner.nextInt();
        System.out.print(" Y qiymatini kiriting = ");
        int y= scanner.nextInt();
        if (x<y){
            System.out.println(x*x-y);
        } else if (x==y){
            System.out.println(x*x+y*y);

        }else{
            System.out.println(Math.sqrt(x*y));
        }
    }
}
