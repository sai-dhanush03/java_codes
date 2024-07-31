package alpha_codes;
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int lines = 1; lines <= n; lines++) {
            for (int star = 1; star <= lines; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
