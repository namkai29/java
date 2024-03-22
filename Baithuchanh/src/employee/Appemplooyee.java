package employee;

public class Appemplooyee {
    public static void main(String[] args) {
        parttime pt=new parttime();
        pt.nhapParttime();
        System.out.println("Luong cua nhan vien parttime "+pt.tinhLuong());

        System.out.println("NHAN VIEN FULLTIME");
        fulltime fl=new fulltime();
        fl.nhapfULLtime();
        System.out.println("Luong cua nhan vien fulltime "+fl.tinhLuong());
    }
}
