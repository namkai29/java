package Shapes;

public class AppShapes {
    public static void main(String[] args) {
       
      hinhHoc hh =new hinhHoc();
       // ht.nhap();
        //ht.tinhChuVi();
        //ht.inChuVi();
       hinhTron ht=new hinhTron();
        //ht.tinhDienTich();
        //System.out.println(ht.dienTich);

        hinhTru htr=new hinhTru();
        htr.nhap();
        
        System.out.print("The tich cua hinh tru la: "+htr.tinhTheTich());
        
    }
    
}
