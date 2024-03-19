package ra;

public class Cat extends Animals{
    private String color;

    public Cat() {
    }

    public Cat(String species, boolean gen) {
        super(species, gen);
    }

    public Cat(String species, boolean gen, String color) {
        super(species,gen); // hàm tạo cua lơp cha
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void makeSound(){ // ghi đè phuong thức
        System.out.println("meo meo");
    }
    public void makeSoundParent(){
        super.makeSound(); // truy cập các thanh phan của lớp cha
    }
}
