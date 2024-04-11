package Lab3.src.LuongNV;

public class fulltime extends nhanvien {
    private int ngayLamThem;
    public int loaiChucVu;// 1 SEP 2.Linh

    public fulltime(String ten) {
        this.ten = ten;
    }

    public fulltime(String ten, int ngaylam) {
        this.ten = ten;
        this.ngayLamThem = ngaylam;

    }

    public void setLoaiChucVu(int loaiCV) {
        this.loaiChucVu = loaiCV;

    }

    @Override
    public String loaiNhanVien() {

        return "Nhan vien fulltime";

    }
    public void  tinhLuong(){
       if (loaiChucVu==1){
          luong=(20+0.8*ngayLamThem);
      // System.out.println("Luong cua nhan vien lam sep fulltime la "+luong);

       }else if  (loaiChucVu==2){
        luong=10+0.8*ngayLamThem;
       // System.out.println("Luong cua nhan vien lam linh fulltime la "+luong);
       }

    }

}
