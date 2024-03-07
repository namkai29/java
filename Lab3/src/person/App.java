package person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        perSon ps=new perSon();
        ps.nhapThongTin();
        float  soDu;
        System.out.print("So tien su dung trong thang vua qua la: ");
        Scanner sc=new Scanner(System.in);
        soDu=sc.nextFloat();
        ps.thayDoiSD(soDu);
        System.out.println("Sau khi su dung :");
        ps.inThongTin();
    }
}
