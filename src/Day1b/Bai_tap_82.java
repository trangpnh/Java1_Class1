package Day1b;

import java.util.Scanner;

public class Bai_tap_82 {
    public static void main(String[] args) {
        /*Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.*/
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a, b, c =");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        if( a >= b && a >= c)
            System.out.println(a+" là số lớn nhất!!");

        else if (b >= a && b >= c)
            System.out.println(b+" là số lớn nhất!!");
        else
            System.out.println(c+" là số lớn nhất!!");
    }
}
