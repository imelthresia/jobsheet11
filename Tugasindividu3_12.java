import java.util.Scanner;
public class Tugasindividu3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N (minimal 3) = ");
        int n= sc.nextInt();

        if (n < 3) {
            System.out.println("N minimal harus 3.");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
