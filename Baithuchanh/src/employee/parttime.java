package employee;

import java.util.Scanner;

public class parttime extends Employee {
    public int soGio;
    public float luongGio;
    public void nhapParttime(){
        Scanner sc=new Scanner(System.in);
        super.nhap();
        System.out.print("\nLuong tinh theo gio: ");
        luongGio=sc.nextFloat();
        System.out.print("\nSo gio lam : ");
        soGio=sc.nextInt();
    }

    public float tinhLuong(){
        return luongGio*soGio;
    }
    
}
