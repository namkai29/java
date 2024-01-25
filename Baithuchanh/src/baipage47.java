import java.util.Scanner;

public class baipage47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,tong=0;

     do{
        System.out.print("Nhap so");
        a=sc.nextInt();
        tong+=a;
        
     }while(tong<100);
     System.out.print("Tong cac so da tap la:"+tong);
       
      
    }
}
