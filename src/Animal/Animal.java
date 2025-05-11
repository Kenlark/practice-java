package Animal;

public class Animal implements Manger, Dormir{
    private String name;

    @Override
    public void dormir() {
        System.out.println(name + " Dort");
    }

    @Override
    public void manger() {
        System.out.println(name + " Mange");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
