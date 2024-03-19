package ra;

public class Animals { // lớp final ko thể kế thưad
    private String species; // loài
    private boolean gen; // giới tính


    public void makeSound(){ //final cho phương thức thì ko thể bị ghi đè
        // tiếng kêu
        System.out.println("nothing");
    };

    public Animals(String species, boolean gen) {
        this.species = species;
        this.gen = gen;
    }

    public Animals() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isGen() {
        return gen;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }
}
