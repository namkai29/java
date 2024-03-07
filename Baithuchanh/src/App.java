import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    HinhTron ht = new HinhTron();
    HinhTron ht1 = new HinhTron();

    toado td = new toado();
    Scanner sc = new Scanner(System.in);
    System.out.print("x=");
    td.x = sc.nextInt();
    System.out.print("\ny=");
    td.y = sc.nextInt();
    ht.setToaDo(td);
    ht.xuatToaDo();
    ht1.setToaDo(5, 10);
    ht1.xuatToaDo();

  }
}
