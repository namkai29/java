import java.util.Scanner;

public class tongsochan {
    public static void main(String[] args) {
        int a[], n, i, tongSo = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = sc.nextInt();
        } while (n <= 0);
        a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();

        }
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                tongSo += a[i];

        }
        System.out.println("Tong cac so chan trong mang la: " + tongSo);

    }
}
