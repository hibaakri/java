public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public static final int MAX_CAGES = 25; // Attribut rendu constant

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
       // this.nbrCages = nbrCages;


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
    public boolean addAnimal(Animal animal) {
        int animalCount = 0;
        for (Animal a : animals) {
            if (a != null) {
                animalCount++;
                if (a.name.equals(animal.name)) {
                    System.out.println("Cet animal existe déjà dans le zoo.");
                    return false;
                }
            }
        }
        if (animalCount >= nbrCages) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Animal ajouté avec succès au zoo.");
                return true;
            }
        }
        return false;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Nom de l'animal : " + animal.name);
                System.out.println("Famille : " + animal.family);
                System.out.println("Âge : " + animal.age);
                System.out.println("Mammifère : " + animal.isMammal);
                System.out.println("--------------------------");
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null;
                System.out.println("Animal supprimé avec succès du zoo.");
                return true;
            }
        }
        System.out.println("L'animal spécifié n'a pas été trouvé dans le zoo.");
        return false;
    }
    public boolean isZooFull() {
        return animals.length >= MAX_CAGES;
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animals.length > z2.animals.length) {
            return z1;
        } else if (z2.animals.length > z1.animals.length) {
            return z2;
        } else {
            System.out.println("Les zoos ont le même nombre d'animaux.");
            return null;
        }
    }
}