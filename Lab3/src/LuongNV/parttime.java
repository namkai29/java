package Lab3.src.LuongNV;

public class parttime extends nhanvien {
    private int gioLamViec;

    public parttime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;

    }

    public String loaiNhanVien() {
        return "Nhan vien parttime";
    }

    public void tinhLuong() {
        luong=0.1*gioLamViec;}
        

}
