package employee;

import java.util.Scanner;

public class fulltime extends Employee{
    public float luongHS,luongThuong;
    public int heSoLuong;
      public void nhapfULLtime(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("\nLuong he so : ");
        luongHS=sc.nextFloat();
        System.out.print("\nHe so luong : ");
        heSoLuong=sc.nextInt();
        System.out.print("\nThuong thang: ");
        luongThuong=sc.nextFloat();
    }

    public float tinhLuong(){
        return luongHS*heSoLuong+luongThuong;
    }


    
}
