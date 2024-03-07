package person;

import java.util.Scanner;

public class sinhvien {
     public String hoTen;
    public String maSV;
    public float diemMon1;
    public float diemMon2;
    public float diemMon3;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap thong tin sinh vien :");
        System.out.print("Ho va ten:");
        hoTen = sc.nextLine();
        System.out.print("\nMa sinh vien ");
        maSV = sc.nextLine();
        System.out.print("\nDiem mon 1 :");
        diemMon1 = sc.nextFloat();
        System.out.print("\nDiem mon 2 :");
        diemMon2 = sc.nextFloat();
        System.out.print("\nDiem mon 3 :");
        diemMon3 = sc.nextFloat();
    }

    public float diemTB() {
        return (diemMon1 + diemMon2 + diemMon3) / 3;

    }

    public void inThongTin() {
        System.out.println("\nThong tin sinh vien :");
        System.out.print("Ho va ten:" + hoTen);
        System.out.print("\nMa sinh vien " + maSV);
        System.out.print("\nDiem trung binh cac mon hoc:" + diemTB());

    }

    public void ketQua() {
        if (diemTB() >= 8)
            System.out.println("\nDat loai gioi!");
        else if (diemTB() >= 6.5)
            System.out.println("\nDat loai kha!");
        else if (diemTB() >= 5)
            System.out.println("\nDat loai trung binh!");
        else
            System.out.println("\nDat loai yeu!");
    }
    
    
}
