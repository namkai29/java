import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class chuoikytu {
    public static void main(String[] args) {
        String s;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap xau ky tu:");
        s = sc.nextLine();
        for (i = 0; i < s.length(); i++) {

            System.out.println(s.charAt(i));
        }
    }

}
