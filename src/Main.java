import ra.Animals;
import ra.Cat;
import ra.Dog;
import ra.Math;
import static ra.Math.PI;

public class Main {
    public static void main(String[] args) {
        Math m1 = new Math();
//        Math m2 = new Math();
//        m1.PI =100;
//        System.out.println(m1.PI);
//        System.out.println(m2.PI);
//        System.out.println(Math.PI);
//        System.out.println(m1.count);
        System.out.println(PI);

        Math.SubClass sub = new Math.SubClass();
//        Object

        // tạo đối tượng mèo
        Cat cat = new Cat("Ba tư",true,"red");
        cat.makeSoundParent();
        System.out.println("species : "+cat.getSpecies());
        System.out.println("species : "+cat.getColor());
        System.out.println("species : "+cat.isGen());

        Dog dog = new Dog("bug",true);
        System.out.println(dog.getSpecies());
        System.out.println(dog.isGen());
        dog.catchMouse();


        // ép  kiểu
        //epsp kiểu từ con lên cha
        Animals animals = cat; // ép kiểu ngầm định
         animals.makeSound();
        // ép kiểu từ cha xuống con
//        Animals animals = new Animals();
        // toán tử instanceOf
        if (animals instanceof Cat) {
            Cat jerry = (Cat) animals; // ép kiểu tường minh
            System.out.println(jerry.getColor());
        }

        // phần trước dấu = gọi là kểu dữ liệu khai báo
        // phần sau dấu  = kieu du liệu thực tế

        Animals animals1 = new Cat("lông ngắn",true,"White");



    }
}