package Day1b;

import java.util.Scanner;

public class Bai_tap_2 {
    /*Viết chương trình nhập vào số năm x, hỏi x là năm nhuận hay năm không nhuận
    * Dữ liệu test:2000 2020 2024 => nhuận
    * 1800,2023,1990 => không nhuận
    * -123, -200 => không hợp lệ */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số năm cần kiểm tra: ");
        int x = in.nextInt();
        in.close();
        if(x <1582){
            System.out.println(x + " nhập vào không hợp lệ");
            System.exit(0);
        }
        {
                if (x % 400 == 0||x % 4 == 0 && x % 100 !=0) {
                    System.out.println(x + " là năm nhuận!");
                    System.exit(0);
                }
                System.out.println("Không nhuận");

        }

    }
}
