package Day2a;

import java.util.Scanner;

public class Bai_tap_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();
        in.close();

        if(n<=0) {
            System.out.println("Nhập lại n: ");
            System.exit(0);
        }
        double S = 0;
        for(long i = 1; i <= n; i++){
            S = S + 1.0/i;
        }
        System.out.println("Tổng là "+S);
    }
}
