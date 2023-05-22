import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Massiv {
    public static Character[] convert(char[] chars) {
        Character[] copy = new Character[chars.length];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = Character.valueOf(chars[i]);
        }
        return copy;
    }

    public static void main(String[] args) {
        char[] a = {'d', 'g', 'a', 'v', 'm'};
        Character[] b = convert(a);
        System.out.println(Collections.max(Arrays.asList(b)));
    }
}
