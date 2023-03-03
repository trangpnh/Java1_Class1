package Day1b;

import java.net.SocketOption;
import java.util.Scanner;

public class Bai_tap_4 {
    /*Nhập vào số nguyên x, kiểm tra x có là số chính phương hay không*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập vào số x: ");
        int x = in.nextInt();
        in.close();

        double tmp = Math.sqrt(x);
        int tmp1 = (int) tmp;
        if(tmp == tmp1){
            System.out.println("Là số chính phương !");
        }
        else {
            System.out.println("Không là số chính phương !");
        }
    }
}
