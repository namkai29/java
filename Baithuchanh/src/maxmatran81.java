import java.util.Scanner;

public class maxmatran81 {
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran:");
        m=sc.nextInt();
        System.out.print("Nhap so cot cua ma tran:");
        n=sc.nextInt();
        int a[][]=new int [m][n];
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
                System.out.print("a["+(i+1)+"]["+(j+1)+"]=");
                a[i][j]=sc.nextInt();
            }
        }
        int max=a[0][0];
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
               if (a[i][j]>max)max=a[i][j];
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la: "+max);


        

       
    }
}
