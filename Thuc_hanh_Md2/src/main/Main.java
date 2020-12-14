package main;

import program.PersonProgram;
import program.Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonProgram personProgram = new PersonProgram();
        Program program = new Program();

        int n = 0;
        do {
            System.out.println("-------Chương trình quản lý danh bạ-------");
            System.out.println("Chọn chức năng theo số (để tiếp tục) :");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng: ");

            n = Integer.parseInt(scanner.nextLine());
            switch (n){
                case 1:
                    program.show();
                    break;
                case 2:
                    program.add();
                    break;
                case 3:
                case 4:
                    program.delete();
                    break;
                case 5:
                    program.search();
                    break;
                case 6:
                    program.readerFile();
                    break;
                case 7:
            }
        } while (n != 8);
    }
}
