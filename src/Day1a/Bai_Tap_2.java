package Day1a;

import java.util.Scanner;

public class Bai_Tap_2 {
    /*Nhập vào 3 số thực float x,y,z
    In ra tbc và tbn của x,y,z
        tbn là căn bậc
    Kết quả làm tròn đến chữ số thập phân số 3
    Gợi ý: nextFloat()

    Math.pow(a,b)
    Math.pow(3.2) tương ứng 3*2*/
    public static void main(String[] args) {
        //Bước 1: Khai báo biến
        float x,y,z;
        //Bước 2: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập x, y, z = ");
        x = in.nextFloat();
        y = in.nextFloat();
        z = in.nextFloat();
        in.close();
        //Bước 3: Tính và in ra TBC và TBN của x,y,z
        float tbc = (x+y+z)/3;
        double tbn = Math.pow(x*y*z, 1.0 / 3);
        System.out.printf("TBC x và y và z là %.3f",tbc);
        System.out.printf("\nTBN x và y và z là %.3f",tbn);
    }

}
