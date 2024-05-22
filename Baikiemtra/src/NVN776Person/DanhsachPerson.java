package NVN776Person;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhsachPerson {
    int n;

    
    Scanner sc= new Scanner(System.in);
    ArrayList<Person> arrlist=new ArrayList<>();
    //them person 
    public void themPerson(){
        Person ps=new Person();
        ps.nhap();
        arrlist.add(ps);

    }
    //xoa person
    public void xoaPerson(){
        System.out.println("Nhap thong tin person can xoa:");
        Person ps=new Person();
        ps.nhap();
        for (int i=0;i<n;i++){
            if (arrlist.get(i)==ps)
            arrlist.remove(ps);

        }
    }
    for(int i=0;i<n;i++){
        
    }

}
