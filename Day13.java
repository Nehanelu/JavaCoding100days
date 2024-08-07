import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading N and X
        int N = sc.nextInt();
        int X = sc.nextInt();

        // Reading the array
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Searching for X in array A
        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
