package set_class;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        String pre;
        System.out.print("Nhap: ");
        Scanner sc = new Scanner(System.in);
        pre = sc.nextLine();
        hs.add(pre);
        /*for (String x : hs) {
            System.out.println(x);

        }*/
        // Them phan tu
        System.out.println("Nhap phan tu muon them");
        String temp;
        temp = sc.nextLine();
        if (hs.contains(temp)) 
           System.out.println("Phan tu da co trong set");
           else {hs.add(temp);
            System.out.println("Sau khi them phan tu moi");
           for (String x : hs) {
            System.out.print(x+"    ");

        }
    }

        
        // Xoa phan tu
        System.out.println("Nhap phan tu muon xoa");
        String tem;
        tem = sc.nextLine();
        if (hs.contains(temp)) {
            hs.remove(tem);

        }
        System.out.println("Phan tu con lai sau khi xoa gom");
        for (String x : hs) {
            System.out.print(x+"    ");

        }

    }
}
