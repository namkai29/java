package arrlist_linkedlist;
//Nhap vao 1 arrList

//in ra phan tu max trong arrList

import java.util.ArrayList;
import java.util.Scanner;

public class max_arrlist {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua arrList");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num;
            System.out.print("arrList[" + (i + 1) + "]=");
            num = sc.nextInt();
            arrList.add(num);

        }
        int max = arrList.get(0);
        for (int i = 1; i < n; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);

            }

        }
        System.out.println("Phan tu lon nhat cua mang la : " + max);
    
    }
}
