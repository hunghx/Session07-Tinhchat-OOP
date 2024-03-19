package ra;

public class Dog extends Animals{
    public void catchMouse(){
        System.out.println("Đang băt chuột");
    }

    public Dog() {
    }

    public Dog(String species, boolean gen) {
        super(species, gen);
    }

    @Override
    public void makeSound() {
        System.out.println("go go");
    }
}
