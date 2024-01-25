import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        double heSoA ,heSoB,x;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap he so A:");
        heSoA=sc.nextDouble();
        System.out.println("He so B:");
        heSoB=sc.nextDouble();
        if (heSoA==0) {
            System.out.println("Khong phai phuong trinh bac 1");

            
        }
        else{
        x=-heSoB/heSoA;
        System.out.println("Nghiem cua phuong trinh la:"+x);
        }
    }
}
