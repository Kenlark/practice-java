package Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.print("Enter the name of animal: ");
        String name = sc.nextLine();

        animal.setName(name);

        animal.manger();
        animal.dormir();

        System.out.print("Enter the name of the turtle: ");
        String name2 = sc.nextLine();

        System.out.print("Enter the age of the turtle: ");
        int age = sc.nextInt();

        Tortue tortue = new Tortue(name2 , age);

        tortue.setName(name2);
        tortue.setAge(age);

        tortue.manger();
        tortue.dormir();
        tortue.afficher();

        sc.close();
    }
}
