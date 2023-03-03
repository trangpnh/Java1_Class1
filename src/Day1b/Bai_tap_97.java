package Day1b;

import java.util.Scanner;

public class Bai_tap_97 {
    /*Viết chương trình nhập 3 cạnh của một tam giác. Hãy cho biết đó là
tam giác gì?*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập cạnh a = ");
        int a = in.nextInt();
        System.out.print("Nhập cạnh b = ");
        int b = in.nextInt();
        System.out.print("Nhập cạnh c = ");
        int c = in.nextInt();
        in.close();

        if(a + b <= c || a + c <= b ||  b + c <= a){
            System.out.println("\nTam giác không hợp lệ.!");
        }
        else {
            if((a == b) && (b == c)){
                System.out.println("Tam giác đều");
            }
            else {
                if(a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c)
                {
                    System.out.println("Tam giác vuông");
                    System.exit(0);
                }
                if(a == b || a == c || b == c){
                    System.out.println("Tam giác cân");
                    System.exit(0);
                }
                else {
                    System.out.println("Tam giác thường");
                    System.exit(0);
                }
            }
        }
    }
}
