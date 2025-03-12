
public abstract class Person {

    String name;
    int age;
    Hobby hobby;

    public Person(String name, int age, Hobby hobby) {

        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Hobby getHobby() {
        return this.hobby;
    }

    @Override 
    public String toString() {
        return "name: " + this.name + " age: " + age + " hobby: " + hobby;
    }

}