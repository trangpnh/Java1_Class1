package Day1a;

import java.util.Scanner;

public class Bai_Tap_4 {
    /*Tính giá trị của biểu thức A=(2x>5) and (3y<10) or (5z+6>t)
    * Với x,y,z,t là các số nguyên.
    * Gợi ý: Boolean A*/
    public static void main(String[] args) {
        int x,y,z,t;
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập x,y,z,t = ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        t = in.nextInt();
        in.close();

        Boolean A =(2*x>5) && (3*y<10) ||(5*z+6>t);
        System.out.println(A);
    }
}
