package Day1a;

import java.util.Scanner;

public class Exemple2 {
    public static void main(String[] args) {
        /*Nhập 2 số nguyên a,b từ bàn phím. Sau đó in ra tổng của chúng*/
        //Bước 1: Khai báo biến
        int a;
        int b;
        //Bước 2: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.printf("a = ");
        a = in.nextInt();

        System.out.printf("b = ");
        b = in.nextInt();
        //Bước 3: Tỉnh tổng
        int t = a + b;
        System.out.printf("%d + %d = %d",a,b,t);

    }
}
