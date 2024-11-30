//3. Creează o clasă NumericBox care să accepte doar tipuri numerice (Integer, Double, etc.).

public class NumericBox<T extends Number> {
    
    T num;

    NumericBox(T num) {
        this.num = num;
    }

    public void set(T num) {
        this.num = num;
    }

    public T get() {
        return this.num;
    }
}
