package Day1b;

import java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) {
        /*Nhập số nguyên x từ bàn phím, in ra x là số âm hay dương*/
        //Input:m số nguyên x
        //Output: Kết luận âm hay dương?
        //Xác nhận biểu thức logic (condition)
        //x>0 =>Dương
        //x==0 => o
        //x<0 => âm
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        in.close();
            if(x >0 ){
                System.out.println(x + " Là số dương");
            }
            if(x == 0){
                System.out.println(x + " là số không âm không dương");
            }
            if(x < 0){
                System.out.println(x + " là số âm");
            }
        }
}
