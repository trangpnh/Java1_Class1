package Day1a;

import java.util.Scanner;

public class Bai_Tap_1 {
    public static void main(String[] args) {
        /*Nhập 2 số nguyên (long) x và y. In ra trung bình cộng của 2 số đó. Gợi ý nextLong()*/
        //Bước 1: Khai báo biến
        long x;
        long y;
        //Bước 2: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.printf("x = ");
        x = in.nextLong();

        System.out.printf("y = ");
        y = in.nextLong();
        //Bước 3: Tỉnh trung bình cộng
        double tbc = (x+y)/2.0;
        System.out.printf("TBC x và y là %.2f",tbc);

    }

}
