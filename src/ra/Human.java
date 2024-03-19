package ra;

public abstract class Human {
    // là 1 lơp bth
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void career();
}
