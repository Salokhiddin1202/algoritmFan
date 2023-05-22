import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class labaratoriya4dars {
    public static void
    findMinMaxPermutation(List<Integer> A)
    {
        int n = A.size();

        HashSet<Integer> s = new HashSet<Integer>();
        List<Integer> mini = new ArrayList<Integer>();
        List<Integer> maxi = new ArrayList<Integer>();

        for (int i = 1; i < n + 1; i++)
            s.add(i);
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.MAX_VALUE;

            if (curr_max < A.get(i)) {
                number = A.get(i);
            }

            // Choosing the smallest element less than A[i]
            else
                for (int var : s) {

                    // For elements in Set
                    if (var < number)

                        // Update the minimum element
                        number = var;
                }

            // Erasing from set
            s.remove(number);

            // Pushing the elements to vector
            mini.add(number);

            // Keep updating the max
            curr_max = Math.max(curr_max,
                    mini.get(mini.size() - 1));
        }
        curr_max = 0;

        // Pushing all the elements into set till n
        for (int i = 1; i < n + 1; i++)
            s.add(i);
        for (int i = 0; i < n; i++) {
            int number = 0;

            // If curr_max is less
            if (curr_max < A.get(i))
                number = A.get(i);

                // Choosing the bigger element but less than
                // A[i]
            else {
                for (int num : s) {
                    if (num <= A.get(i))
                        number = Math.max(number, num);
                }
            }

            // Erasing from set
            s.remove(number);

            // Pushing the elements to vector
            maxi.add(number);

            // Keep updating the max
            curr_max = Math.max(curr_max,
                    maxi.get(maxi.size() - 1));
        }
        System.out.print(
                "Lexicographically smallest permutation is : ");
        for (int i : mini)
            System.out.print(i + " ");
        System.out.println("");
        System.out.print(
                "Lexicographically largest permutation is : ");
        for (int i : maxi)
            System.out.print(i + " ");
        System.out.println("");
    }

    public static void main(String[] args)
    {
        List<Integer> A = new ArrayList<Integer>(
                Arrays.asList(2, 4, 4, 4, 6, 6));

        // Function call
        findMinMaxPermutation(A);
    }
}
