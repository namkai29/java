package Baithuchanh.arrlist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class arrlist {
    public static void main(String[] args) {
        ArrayList <sinhvien> arrList=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu");
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            sinhvien sv=new sinhvien();
            sv.nhap();
            arrList.add(sv);
        }
        for (sinhvien sv : arrList) {
           sv.in();

           
            
        }
    }

    
}
