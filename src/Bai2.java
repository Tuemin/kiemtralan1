import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao N = ");
        n = sc.nextInt();
        if (n < 2) {
            System.out.println("Nhap n thoa man 2<=N<=20");
        } else if (n > 20) {
            System.out.println("Nhap n thoa man 2<=N<=20");
        } else {
            for (int i = 1; i <= 10; i++) {
                int b;
                b = n * i;
                System.out.println(n + "x" + i + "=" + b);
            }
        }
    }
}
