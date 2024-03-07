import java.util.Scanner;

public class HinhTron {
    public final float PI = 3.14f;
    public float banKinh;
    // public float chuVi;
    public float dienTich;
    public toado toaDo;

    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh =");
        banKinh = sc.nextFloat();

    }

    public void setBanKinh(float r) {
        this.banKinh = r;
    }

    public void setToaDo(toado d) {
        this.toaDo = d;

    }

    public void setToaDo(int x, int y) {
        this.toaDo = new toado();
        this.toaDo.x = x;
        this.toaDo.y = y;
    }

    public void xuatToaDo() {
        System.out.println("Toa do cua hinh tron la");
        System.out.print("x= " + this.toaDo.x);
        System.out.print("y= " + this.toaDo.y);
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
