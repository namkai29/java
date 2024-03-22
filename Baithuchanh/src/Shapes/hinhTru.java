package Shapes;

import java.util.Scanner;

public class hinhTru extends hinhTron {
    public float chieuCao;
    
     
        //TODO Auto-generated constructor stub
    
    hinhTru(){
        ten="Hinh Tru";


    }

   
    public void nhap() {
       
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Chieu cao =");
        chieuCao = sc.nextFloat();

    }
    public float tinhTheTich(){
       return theTich=Pi*banKinh*banKinh*chieuCao;
    }


}
