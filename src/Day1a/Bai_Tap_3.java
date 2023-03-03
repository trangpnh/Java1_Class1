package Day1a;

import java.util.Scanner;

public class Bai_Tap_3 {
    /*Nhập vào số nguyên a và b
    * In ra thương của a/b
    * VD: 5/2 dư 1*/
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập a, b =");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        System.out.printf("%d : %d dư %d",a,b,a%b);

    }
}
