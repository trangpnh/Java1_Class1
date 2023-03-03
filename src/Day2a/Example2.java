package Day2a;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập a, b: ");
        long a = in.nextLong();
        long b = in.nextLong();
        in.close();

        if(a>=b){
            System.out.printf("Không thỏa mãn !");
            System.exit(0);
        }
        long count =0;
        for(long i = a+1;i<b;i++){
            if(i % 2 !=0){
                count = count +1;
            }
        }
        System.out.printf("Có tất cả %d  số lẻ trong khoảng (%d,%d)",count,a,b);
    }
}
