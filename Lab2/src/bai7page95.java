import java.util.Scanner;

public class bai7page95 {
    public static void main(String[] args) {
        int n, i, tong = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();

        } while (n <= 0);
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "]=");
            a[i] = sc.nextInt();
            tong += a[i];

        }

        System.out.print("Trung binh cong cua mang la : " + (float) tong / n);
    }

}
