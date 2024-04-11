package Lab3.src.LuongNV;

public class nhanvien {
    protected String ten;
    protected double luong;
    public nhanvien(){

    }
    public nhanvien(String ten){
        this.ten=ten;
    }
   
    protected String  loaiNhanVien(){
        return " ";

    }
    public void inThongTin(){
        System.out.println("Ten nhan vien "+ten);
        System.out.println("Loai nhan vien "+loaiNhanVien());
        System.out.println("Luong "+luong+" VND");
    }
    
}
