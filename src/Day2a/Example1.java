package Day2a;

import java.util.Scanner;

public class Example1 {
    //In ra các số chẵn trong đoạn
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Nhập a, b: ");
        long a = in.nextLong();
        long b = in.nextLong();
        in.close();

        if(a>=b){
            System.out.println("Không thỏa mãn !");
            System.exit(0);
        }
        System.out.println();
        for(long i = a;1<=b;i++){
            if(i % 2 ==0)
                System.out.print(i + "\t");
        }
    }
}
