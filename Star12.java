import java.util.Scanner;

public class Star12 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai 5 =");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            System.out.print("*");
        }
}
}