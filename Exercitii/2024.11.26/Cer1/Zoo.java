package Cer1;

import java.util.ArrayList;

public class Zoo {

    String name;
    ArrayList<Animal> landAnimals = new ArrayList<>();
    ArrayList<Animal> airAnimals = new ArrayList<>();
    ArrayList<Animal> waterAnimals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {

        switch (animal.habitat) {
            case Land:
                landAnimals.add(animal);
                break;

            case Air:
                airAnimals.add(animal);
                break;

            case Water:
                waterAnimals.add(animal);
                break;
        }
    }

    public void showAnimals(Habitat habitat) {

        if(habitat == null) {
            for(Animal e : landAnimals) {
                System.out.println("-"+e+"\n");
            }
            for(Animal e : airAnimals) {
                System.out.println("-"+e+"\n");
            }
            for(Animal e : waterAnimals) {
                System.out.println("-"+e+"\n");
            }
        }
        else {
            switch (habitat) {
                case Land:
                    System.out.println("Land animals: ");
                    for(Animal e : landAnimals) {
                        System.out.println("-"+e+"\n");
                    }
                    break;
            
                case Air:
                    System.out.println("Air animals: ");
                    for(Animal e : airAnimals) {
                        System.out.println("-"+e+"\n");
                    }
                    break;
    
                case Water:
                    System.out.println("Water animals: ");
                    for(Animal e : waterAnimals) {
                        System.out.println("-"+e+"\n");
                    }
                    break;
            }
        }
    }
}