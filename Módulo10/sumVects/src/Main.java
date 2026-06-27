import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values each vector will have? ");
        int N = sc.nextInt();

        int[] vectA = new int[N];
        int[] vectB = new int[N];
        int[] vectC = new int[N];

        System.out.println("Type the values of vect A: ");
        for (int i = 0; i < N; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Type the values of vect B: ");
        for (int i = 0; i < N; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("RESULT VECT: ");
        for (int i = 0; i < N; i++) {
           System.out.println(vectC[i]);
        }

        sc.close();
    }
}