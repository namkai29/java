import java.util.Scanner;

public class bai6page95 {
    public static void main(String[] args) {
        int n,giaiThua=1;

        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Nhap so :");
            n=sc.nextInt();
        }while (n<=0);
        do{
            giaiThua*=n;
            n--;

        }while (n>=1);
        System.out.println("Giai thua ="+giaiThua);
    }
}
