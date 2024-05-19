package arrlist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<sinhvien> arrList = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sinhvien sv = new sinhvien();
            sv.nhap();
            arrList.add(sv);
        }
        System.out.println("Sinh vien co hoc luc gioi :");
        for (sinhvien sv : arrList) {
            if (sv.getdiem(sv) > 8)
                sv.in();

        }
        
    }

}
