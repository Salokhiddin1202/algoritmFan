import java.util.Scanner;

public class labaratoriya4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juftsum=scanner.nextInt();
        int toqsum=scanner.nextInt();
        int [] array={9,56,65,6,21,13};

        for (int i = 0; i <array.length ; i++) {
            if (i%2==0){
                juftsum=+array[i];
            }
            if (i%2==1){
                toqsum+=array[i];
            }

        }
        int ayirma=juftsum-toqsum;
        System.out.println(ayirma);
    }
}
