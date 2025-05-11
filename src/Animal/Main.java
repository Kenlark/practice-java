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
        int age1 = sc.nextInt();

        Tortue tortue = new Tortue(name2 , age1);

        tortue.setName(name2);
        tortue.setAge(age1);

        tortue.manger();
        tortue.dormir();
        tortue.afficher();

        sc.nextLine();

        System.out.print("Enter the name of the dog: ");
        String name3 = sc.nextLine();

        System.out.print("Enter the age of the dog: ");
        int age2 = sc.nextInt();

        Chien chien = new Chien(name3, age2);

        chien.setName(name3);
        chien.setAge(age2);

        chien.manger();
        chien.dormir();
        chien.afficher();

        sc.close();
    }
}
