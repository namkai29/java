package Shapes;

import java.util.Scanner;

public class hinhTron extends hinhHoc {
    public float banKinh;
     
    public hinhTron(){
        ten="Hinh Tron";

    }
    public  hinhTron(String ten,float banKinh){
        this.ten=ten;
        this.banKinh=banKinh;
    }
   
    public void nhap(){
       
        Scanner sc =new Scanner(System.in);
        System.out.print("Ban kinh cua hinh tron =");
        banKinh=sc.nextFloat();
        
    }

    public float tinhChuVi(){
        return chuVi=Pi*2*banKinh;
       
    }
    public float tinhDienTich(){
         return dienTich=super.Pi*banKinh*banKinh;
       

    }


    
}
