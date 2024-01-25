import java.util.Scanner;

import javax.print.DocFlavor.STRING;

/**
 * page93
 */
public class page93 {

    
    public static void main(String[] args) {
        
        int namSinh;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho va ten ");
         String hoTen =sc.nextLine();
         System.out.print("Nhap nam sinh ");
         namSinh=sc.nextInt();
         int tuoi=2024-namSinh;
        if (tuoi<16) {
            System.out.println("Ban "+hoTen+" o do tuoi vi thanh nien");
            
        }
        else if (tuoi>=16&&tuoi<18) {
            System.out.println("Ban "+hoTen+" o do tuoi truong thanh");


            
        } else {
            System.out.println("Ban "+hoTen+" da gia");
            
        } {

        }
        

    }
}