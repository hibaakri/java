//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo("Mon zoo", "Ma ville", 25);
        myZoo.displayZoo();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        myZoo.addAnimal(lion);
        myZoo.displayAnimals();
        Animal searchedAnimal = new Animal("Felidae", "Lion", 5, true);
        System.out.println("Indice de l'animal recherché : " + myZoo.searchAnimal(searchedAnimal));
        myZoo.removeAnimal(searchedAnimal);
    }



}