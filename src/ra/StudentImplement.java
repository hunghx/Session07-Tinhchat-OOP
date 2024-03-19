package ra;

import java.util.Scanner;

public class StudentImplement implements IDesignStudent{
    private static Student[] students = new Student[0]; // biến instance
    @Override
    public void addNewStudent() {
        // mảng co  giãn
        System.out.println("Nhập vào số  luơng cần them mới");
        byte count = new Scanner(System.in).nextByte();
        // tạo mảng mới
        Student[] newStudents = new Student[students.length+count];
        System.arraycopy(students,0,newStudents,0,students.length); // copy mảng
        for (int i = 0; i <count ; i++) {
            Student student = new Student();
            student.inputData();
            newStudents[students.length+i] = student;
        }
        // gán lại
        students = newStudents;
    }

    @Override
    public void displayAllStudent() {
        if (students.length ==0){
            System.err.println("Danh sách trống");
        }else {
            for (Student s : students){
                s.displayData();
            }
        }
    }

    @Override
    public void updateInfoStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void findStudentById() {

    }
}
