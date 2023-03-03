package Day1b;

import java.util.Scanner;

public class Bai_tap_96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x = ");
        float x = in.nextFloat();
        in.close();

        float f;
        if(x >= 5) {
            f = 2*x*x + 5*x +9 ;
            System.out.printf("Gia tri cua ham so la: %.2f", f);
        }else {
            f = (-2)*x*x + 4*x - 9;
            System.out.printf("Gia tri cua ham so la: %.2f", f);
        }
    }
}
