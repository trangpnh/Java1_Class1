package Day2a;

import java.util.Scanner;

public class Bai_tap_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();
        int S = 0;
        in.close();

        if(n<=0){
            System.out.println("Nhập lại n: ");
            System.exit(0);
        }
        for (int i = 1; i<=n; ++i ){
            S = S+i;
        }
        System.out.printf("Tổng các số từ 1 đến %d là %d",n,S);
    }
}
