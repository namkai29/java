import java.util.Scanner;

public class baipage35 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat:");
        a=sc.nextInt();
        System.out.print("Nhap so thu hai:");
        b=sc.nextInt();
        System.out.println("So nho hon trong hai so la:"+Math.min(a, b));
    }
}
