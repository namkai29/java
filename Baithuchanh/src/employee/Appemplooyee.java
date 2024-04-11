package employee;

import java.util.Scanner;

public class Appemplooyee {
    public static void main(String[] args) {
        parttime pt=new parttime();
        String luaChon;
        System.out.println("Ban la nhan vien fulltime hay partime");
        Scanner sc=new Scanner(System.in);
       // do{
            luaChon=sc.nextLine();
        //}p
        //while (luaChon!="fulltime"||luaChon!="parttime") ;
            
            
        if (luaChon=="parttime"){
            System.out.println("NHAN VIEN PARTTIME");
        pt.nhapParttime();
        System.out.println("Luong cua nhan vien parttime "+pt.tinhLuong());
        }
else if (luaChon=="fulltime")
{
        System.out.println("NHAN VIEN FULLTIME");
        fulltime fl=new fulltime();
        fl.nhapfULLtime();
        System.out.println("Luong cua nhan vien fulltime "+fl.tinhLuong());
}
    }
}
