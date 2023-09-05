import java.util.Scanner;

// Bài tập giải phương trình bậc ax^2+bx+c =0
public class Bai5 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);  // lệnh để in
        System.out.println("Nhap vao a = ");
        a = sc.nextDouble();
        System.out.println("Nhap vao b = ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c = ");
        c = sc.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;   // b^2 -4ac
        if (delta < 0) {
            System.out.println("Phuong trinh vô nghiệm");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 =" + x1);

        } else {
            x1 = (-b - Math.sqrt(delta)) / (4 * a * c);
            x2 = (-b + Math.sqrt(delta)) / (4 * a * c);
            System.out.println("Phương trình có nghiệm x1=" + x1);
            System.out.println("Phương trình có nghiệm x2=" + x2);


        }
    }
}
