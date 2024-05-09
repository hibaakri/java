package tn.esprit.gestionzoo.entities;
import java.util.ArrayList;
import java.util.List;
public class Zoo {
    private static final int MAX_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;


    public Zoo(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.animals = new ArrayList<>();
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Nom du zoo : " + name + "\nVille : " + city + "\nNombre de cages : " + nbrCages;
    }
    public void addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("The zoo is full, cannot add more animals");
            return;
        }
        animals.add(animal);
        System.out.println(animal.getName() + " added to the zoo.");
    }

    public boolean isZooFull() {
        return animals.size() >= capacity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Zoo capacity cannot be negative");
        }
    }
}