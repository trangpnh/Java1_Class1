package Day1b;

import java.util.Scanner;

public class Bai_tap_98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a, b, c, d, e, f: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        float e = in.nextFloat();
        float f = in.nextFloat();
        in.close();

        float x,y;
        float D = a * e - d * b;
        float Dx = c * e - f * b;
        float Dy = a * f - d * c;
        if(D == 0) {
            if (Dx + Dy == 0) {
                System.out.print("PT vô số nghiệm");
            }
            else {
                System.out.print("PT vô nghiệm");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("PT có nghiệm (x, y) = (%.1f, %.1f)", x, y);
        }
    }
}
