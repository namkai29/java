package person;

import java.util.Scanner;

public class perSon {
    public String hoTen;
    public int tuoi;
    public float soDu;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho Ten :");
        hoTen = sc.nextLine();
        System.out.print("\nTuoi :");
        tuoi = sc.nextInt();
        System.out.print("\nSo du trong tai khoan :");
        soDu = sc.nextFloat();

    }

    public void inThongTin() {

        System.out.print("Ho Ten :" + hoTen);

        System.out.print("\nTuoi :" + tuoi);

        System.out.print("\nSo du trong tai khoan :" + soDu + " m");

    }

    public float thayDoiSD(float chiTieu) {
        return soDu = soDu - chiTieu;

    }

}
