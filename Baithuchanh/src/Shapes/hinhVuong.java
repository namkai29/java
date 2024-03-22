package Shapes;

import java.util.Scanner;

public class hinhVuong extends HinhChuNhat{

    public hinhVuong(){
        ten="Hinh Vuong";

    }
    public void nhapCanh(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Canh=");
        dai=rong=sc.nextInt();
    }
    
    
}
