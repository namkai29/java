package set_class;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String temp;
            temp = sc.nextLine();
            lhs.add(temp);
        }
        System.out.println("LINKEDHASHSET say khi nhap la: ");
        for (String x : lhs) {
            System.out.print(x + "  ");

        }
        // xoa 1 phan tu bang index
        System.out.println("\nNhap phan tu muon xoa");
        String tem;
        tem = sc.nextLine();
        if (lhs.contains(tem)) {
            lhs.remove(tem);

        }
        System.out.println("Phan tu con lai sau khi xoa gom");
        for (String x : lhs) {
            System.out.print(x + "    ");

        }
    }
}
