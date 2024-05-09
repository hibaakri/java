package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("My Zoo", 10);

        Animal lion = new Animal("Lion", 5);
        Animal elephant = new Animal("Elephant", 10);
        Animal giraffe = new Animal("Giraffe", 7);

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(giraffe);

        // Trying to add more animals than the zoo capacity
        for (int i = 0; i < 10; i++) {
            Animal animal = new Animal("Animal " + (i + 1), 3);
            zoo.addAnimal(animal);
        }

    }
}