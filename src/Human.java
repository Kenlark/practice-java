public class Human implements Workable, Eatable {
    public String work() {
        return "Human working...";
    }
    public void eat() { System.out.println("Human eating..."); }
}
