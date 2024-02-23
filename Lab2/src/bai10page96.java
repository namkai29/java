import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai10page96 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        int count=0;

        char kyTu;
        System.out.print("Nhap xau ky tu :");
        s=sc.nextLine();
        System.out.print("\nNhap ky tu can dem :");
        kyTu=sc.nextLine().charAt(0);
        System.out.println(kyTu);
        Pattern pattern=Pattern.compile(String.valueOf(kyTu));
        Matcher matcher=pattern.matcher(s);
        while (matcher.find()) {
            count++;


            
        }
        System.out.println("SO LAN XUAT HIEN :"+count);

        
    }
}
