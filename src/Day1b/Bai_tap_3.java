package Day1b;

import java.util.Scanner;

public class Bai_tap_3 {
    public static void main(String[] args) {
        /*Giải phương trình bậc nhất ax + b = 0*/
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        float a = in.nextFloat();
        System.out.print("Nhập vào số b = ");
        float b = in.nextFloat();
        in.close();

        if(a == 0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm!");
            }
            if(b != 0){
                System.out.println("Phương trình vô nghiệm");
            }
        }
        if(a !=0) {
            double x;
            x = (double) -b / a;
            System.out.println("Phương trình có nghiệm là: x = " + x + ".");
        }

    }
}
