package NVN776Person;
import java.util.Scanner;

public class Person {
    //cau 1
    Scanner sc = new Scanner(System.in);

    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    //cau 2

    public void nhap() {
        System.out.println("\nHo va ten :");
        hoTen = sc.nextLine();
        System.out.println("\nNam sinh :");
        namSinh = sc.nextInt();
        System.out.println("\nGioi Tinh :");
        gioiTinh = sc.nextLine();

    }

    public void in() {
        System.out.println("\nHo va ten :" + hoTen);

        System.out.println("\nNam sinh :" + namSinh);

        System.out.println("\nGioi Tinh :" + gioiTinh);

    }
    

}
