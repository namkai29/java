package employee;

import java.util.Scanner;

public class Employee {
    public String hoTen,maNV;
    public int tuoi;
    public Employee(String hoTen,String maNV,int tuoi){
        this.hoTen=hoTen;
        this.maNV=maNV;
        this.tuoi=tuoi;

        
    }
    public Employee(){
        hoTen="Ngo Van A";

    }
    void nhap(){
        Scanner sc =new Scanner(System.in);

        System.out.print("\nHo va ten nhan vien :");
        hoTen=sc.nextLine();
        System.out.print("\nMa nhan vien : ");
        maNV=sc.nextLine();
        System.out.print("\nTuoi: ");
        tuoi=sc.nextInt();
    }
  

}
