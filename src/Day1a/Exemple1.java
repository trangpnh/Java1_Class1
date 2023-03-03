package Day1a;

import java.util.Scanner;

public class Exemple1 {

    public static void main(String[] args) {
        // In ra Hello world
        // print line
        System.out.println("Hello world");
        // Thử đoạn mã sau và đưa nhận xét
        System.out.print("Welcome to ");
        System.out.print("Java");
        // Thử và đưa nhận xét
        String name = "BKACAD";
        int year = 2023;
        // Print format
        System.out.printf("Xin chào các bạn đến với khoá học tại %s vào %d", name, year);

        /*
        Tạo 2 biến lưu thông tin tên và năm sinh (2000)
        -> In ra tên và tuổi trên một dòng
         */
        String hoTen = "Nguyen Van A";
        int namSinh = 2000;
        int tuoi = 2000 - namSinh;
        System.out.printf("\nHọ Tên: %s \t năm nay %d tuổi",hoTen,tuoi);

    }
}

