import java.util.Scanner;

public class ptb2 {
    public static void main(String[] args) {
        double heSoA ,heSoB,heSoC,x1,x2,denTa;
         Scanner sc =new Scanner(System.in);
         System.out.println("Nhap he so A:");
         heSoA=sc.nextDouble();
         System.out.println("He so B:");
         heSoB=sc.nextDouble();
         System.out.println("He so C:");
         heSoC=sc.nextDouble();
         if (heSoA==0) {
        
            if (heSoB!=0) {
                x1=x2=-heSoC/heSoB;
                System.out.println("Nghiem cua phuong trinh la: "+x1);
            }
            else if (heSoB==0)
            System.out.println("Phuong trinh khong hop le!");
            
         }
         else{
            denTa=heSoB*heSoB-4*heSoA*heSoC;
            if (denTa<0) {
                System.out.println("Phuong trinh vo nghiem!");
                
            }
            else if (denTa==0)
            {
                x1=x2=-heSoB/(2*heSoA);
            System.out.println("Phuong trinh co nghiem kep"+x1);
            }
            else{
                x1=(-heSoB+Math.sqrt(denTa))/(2*heSoA);
                x2=(-heSoB-Math.sqrt(denTa))/(2*heSoA);
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.printf("%.4f",x1);
                System.out.println();
                System.out.printf("%.4f",x2);
            }

         }
        
    }
}
