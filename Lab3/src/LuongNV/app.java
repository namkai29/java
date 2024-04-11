package Lab3.src.LuongNV;

public class app {
    public static void main(String[] args) {
        fulltime ft=new fulltime("Ngo Van Nam");
        ft.setLoaiChucVu(1);
        fulltime ft1=new fulltime("NGuyen MInh Duc");
        ft1.setLoaiChucVu(2);
        fulltime ft2=new fulltime("Vu Duy Thang",10);
        ft2.setLoaiChucVu(2);
        parttime pt=new parttime("Nguyen Dao Tung", 150);
        ft.tinhLuong();
        ft1.tinhLuong();
        ft2.tinhLuong();
        pt.tinhLuong();
        //in thongg tin
        ft.inThongTin();
        ft1.inThongTin();
        ft2.inThongTin();
        pt.inThongTin();


    }
    
}
