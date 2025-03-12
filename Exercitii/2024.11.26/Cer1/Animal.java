package Cer1;

public abstract class Animal {

    String name;
    Habitat habitat;

    public Animal(String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "name:" + name + " " + "habitat:" + habitat;
    }
}