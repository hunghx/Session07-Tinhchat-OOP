package ra;

import java.util.Scanner;

public class StudentManagement {
    private static IDesignStudent designStudent = new StudentImplement() ;
    public static void main(String[] args) {

        while (true){
            System.out.println("=================MENU================");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. hiện thị danh sách học sinh");
            System.out.println("3. Cập nhật thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. thoát");

            System.out.println("Nhập lựa chon");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice){
                case 1:
                    designStudent.addNewStudent();
                    break;
                case 2:
                    designStudent.displayAllStudent();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("Nhap sai");
            }
        }
    }
}
