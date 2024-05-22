package NVN776Person;
import java.util.ArrayList;
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
    //cau 3
     ArrayList<Person> arrlist = new ArrayList<>();

    // them person
    public void themPerson() {
        System.out.println("Nhap thong tin :");
        Person ps = new Person();
        ps.nhap();
        arrlist.add(ps);

    }
    // xoa person

    public void xoaPerson() {
        System.out.println("Nhap thong tin person can xoa:");
        Person ps = new Person();
        ps.nhap();
        for (int i = 0; i < arrlist.size()-1; i++) {
            if (arrlist.get(i) == ps)
                arrlist.remove(ps);

        }
    }

    // hien thi n Person
    public void hienthi() {
        for (int i = 0; i < arrlist.size()-1; i++) {
            System.out.println(arrlist.get(i));

        }
    }
    // sua thong tin Person

    public void sua() {
        int index;
        System.out.println("Nhap chi so Person muon sua thong tin");
        index = sc.nextInt();
        Person ps1 = new Person();
        ps1.nhap();
        arrlist.set(index, ps1);
    }

    

}
