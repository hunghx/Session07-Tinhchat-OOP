package ra;

import java.util.Scanner;

public class Student extends Human {
    private  int id;
    private String name;
    private int age;
    private boolean gender;
    @Override
    public void career() {
        System.out.println("học bài");
    }

    public Student() {
    }

    public Student(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void inputData(){
        System.out.println("Nhap id");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("Nhap tên");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhap tuổi");
        this.age = new Scanner(System.in).nextInt();
        System.out.println("Nhap giới tính");
        this.gender = new Scanner(System.in).nextBoolean();
    }
    public  void  displayData(){
        System.out.printf("| ID : %-3s | Name : %-15s | Age : %-3s | Gen : %-4s |\n",id,name,age,(gender?"Nam":"Nữ"));
    }
}
