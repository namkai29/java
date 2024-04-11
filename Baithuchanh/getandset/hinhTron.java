package Baithuchanh.getandset;

public class hinhTron {
    final float PI = 3.14f;
    private float banKinh;

    public void setBanKinh(float r) {
        this.banKinh = r;

    }

    public float getBanKinh() {
        return banKinh;

    }

    public float tinhChuVi() {
        return 2 * PI * banKinh;
    }

    public float tinhDienTich() {
        return PI * banKinh * banKinh;
    }

}
