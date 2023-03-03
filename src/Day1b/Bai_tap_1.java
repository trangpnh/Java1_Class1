package Day1b;

import java.util.Scanner;

public class Bai_tap_1 {
    /*Viết chương trình nhập vào số nguyên n, hỏi n là số chẵn hay lẻ*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
            if(n % 2 == 0){
                System.out.println(n + " là số chẵn");
            }
            if(n % 2 != 0){
                System.out.println(n + " là số lẻ");
            }
    }
}
