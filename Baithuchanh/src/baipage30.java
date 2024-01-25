import java.util.Scanner;

/**
 * baipage30
 */
public class baipage30 {

    public static void main(String[] args) {
        int n,tongSo=0;
        Scanner sc=new Scanner(System.in);
       do{
        System.out.print("Nhap so :");
        n=sc.nextInt();
       } while (n<=0);
       while (n>0) {
       tongSo+=(int)n%10;
        n/=10;
       
       }
       System.out.println("Ket qua cua bai toan la:"+tongSo);
        
       }
        
       }
