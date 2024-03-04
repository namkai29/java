import java.util.Scanner;

public class HinhTron {
    public final float PI = 3.14f;
    public float banKinh;
    // public float chuVi;
    public float dienTich;

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh =");
        banKinh = sc.nextFloat();

    }

    public float tinhChuVi() {
        return 2 * PI * banKinh;
    }

    public float tinhDienTich() {
        return PI * banKinh * banKinh;
    }

    public void inChuVi() {
        System.out.print("\nChu vi cua hinh tron la: " + tinhChuVi());
    }

    public void inDienTich() {
        System.out.print("\nChu vi cua hinh tron la: " + tinhDienTich());
    }

}
