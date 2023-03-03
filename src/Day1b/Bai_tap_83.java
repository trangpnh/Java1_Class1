package Day1b;

import java.util.Scanner;

public class Bai_tap_83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a,b: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        in.close();
        if((a >= 0 && b >= 0) || (a < 0 && b < 0)) {
            System.out.printf("%.2f va %.2f cung dau", a, b);
            System.exit(0);
        }
        System.out.printf("%.1f va %.1f trai dau", a, b);
    }
}
