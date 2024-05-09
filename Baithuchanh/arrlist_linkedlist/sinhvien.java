package Baithuchanh.arrlist_linkedlist;

import java.util.Scanner;

import Lab3.src.LuongNV.parttime;

public class sinhvien {
    private String hoTen;
    private float diem;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho va ten: ");
        hoTen = sc.nextLine();
        System.out.print("\nDiem=");
        diem = sc.nextFloat();
    }

    public void in() {
       

        System.out.println("Ho va ten: "+hoTen);
       
        System.out.println("Diem="+diem);
       
    }

}
