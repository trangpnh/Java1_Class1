package Day1b;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.SortedMap;

public class Exemple2 {
    public static void main(String[] args) {
        //Switch-case: Làm việc với các giá trị cụ thể
        /*Nhập vào tháng in ra các ngày trong tháng*/
        //Nhập vào tháng -> hiển thị ra số ngày trong tháng
        //Input: tháng - Số nguyên (1-12)
        //Output: số ngày trong tháng
        //30 ngày: 2 4 6 9 11
        //31 ngày: 1 3 5 7 8 10 12
        //T2: 28 hoặc 29 ngày
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int x = in.nextInt();
        in.close();
            if(x<1 || x>12){
                System.out.println("Tháng không hợp lệ !");
                System.exit(0);
            }
            switch(x){
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("Có 30 ngày !");
                break;
                case 2:
                    System.out.println("Có 28 ngày hoặc 29 ngày !");
                    break;
                default:
                    System.out.println("Có 31 ngày !");
                    break;
            }

        }
    }

