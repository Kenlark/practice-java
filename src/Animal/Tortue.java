package Animal;

public class Tortue extends Animal implements Afficher{
    private int age;

    public Tortue(String name, int age) {
        setName(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void afficher() {
        System.out.println("Nom : " + getName() + ", Âge : " + age + " ans.");
    }
}
