package Shapes;

import java.util.Scanner;

public class hinhHoc {
    final float Pi = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    
   
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Ten :");
        ten=sc.nextLine();
        System.out.print("Chu vi :");
        chuVi=sc.nextFloat();
        System.out.print("Dien Tich :");
        dienTich=sc.nextFloat();
        System.out.print("The tich :");
        theTich=sc.nextFloat();
    }
    public void xuatTen(){
        System.out.println("Ten :"+ten);

    }
    public void inChuVi (){
        System.out.println("Chu vi :"+chuVi);

    }
    public void inDienTich (){
        System.out.println("Dien Tich :"+dienTich);

    }
    public void inTheTich (){
        System.out.println("The Tich :"+theTich);

    }



}
