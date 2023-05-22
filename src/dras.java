import java.util.Random;

public class dras {
    public static void main(String[] args) {
        Random random = new Random();


        int array[] = new int[random.nextInt(1, 10)];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1996, 2003);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
