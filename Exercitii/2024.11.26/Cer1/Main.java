package Cer1;

public class Main {
    
    public static void main(String[] args) {
        
        Zoo zoo = new Zoo("my zoo");

        Animal nemo = new Fish("Nemo");
        Animal simba = new Mammal("Simba");
        Animal henriche = new Bird("henrike");
        
        zoo.addAnimal(nemo);
        zoo.addAnimal(simba);
        zoo.addAnimal(henriche);
        
        // zoo.showAnimals(Habitat.Land);
        // zoo.showAnimals(Habitat.Air);
        // zoo.showAnimals(Habitat.Water);

        zoo.showAnimals(null);
    }
}
