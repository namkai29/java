package Baithuchanh.getandset;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        hinhTron ht=new hinhTron();
        float r;
        System.out.print("Nhap ban kinh hinh tron: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        ht.setBanKinh(r);
        System.out.println("Chu vi ="+ht.tinhChuVi());
    }
    
}
