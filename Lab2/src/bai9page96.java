import java.util.Scanner;

public class bai9page96 {
    public static void main(String[] args) {
        String chuoiKyTu;
        int i, so = 0, chuThuong = 0, chuHoa = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu :");
        chuoiKyTu = sc.nextLine();
        for (i = 0; i < chuoiKyTu.length(); i++) {

            if (chuoiKyTu.charAt(i) >= 'a' && chuoiKyTu.charAt(i) <= 'z')
                chuThuong++;
            if (chuoiKyTu.charAt(i) >= 'A' && chuoiKyTu.charAt(i) <= 'Z')
                chuHoa++;
            if (chuoiKyTu.charAt(i) >= '0' && chuoiKyTu.charAt(i) <= '9')
                so++;
        }
        System.out.print("So ky tu thuong trong xau la: " + chuThuong);
        System.out.print("\nSo ky tu hoa trong xau la: " + chuHoa);
        System.out.print("\nSo ky tu so trong xau la: " + so);

    }
}
