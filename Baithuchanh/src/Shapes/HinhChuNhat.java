package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends hinhHoc {
    public float dai,rong;
    HinhChuNhat(){
        ten="Hinh chu nhat";
      
        
    }
    public void nhapChieuDai(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Chieu dai =");
        dai=sc.nextFloat();
       
    }
    public void nhapChieuRong(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Chieu Rong =");
        rong=sc.nextFloat();
       
    }
    public float tinhChuVi(){
        return chuVi=(dai+rong)*2;
      
    }
    public float tinhDienTich(){
       return  dienTich=dai*rong;
       
    }

    

    
}
