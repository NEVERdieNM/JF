public class Dog extends Animal{
    
    public Dog(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void makeSound(){
        System.out.println("bark, bark!");
    }

    public void print(){
        System.out.print("legs super + this:");
        System.out.println(super.legs + this.legs);
    }
}
