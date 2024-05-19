package arrlist_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String temp;
            System.out.print("Nhap phan tu them :");
            temp = sc.nextLine();
            llist.add(temp);

        }

        int index;

        do {
            System.out.print("Nhap chi so cua phan tu can lay : ");
            index = sc.nextInt();

        } while (index < 0 || index > llist.size() - 1);
        llist.get(index);
        System.out.println("Phan tu co chi so=" + index + " la phan tu " + llist.get(index) + " trong List");

    }
}