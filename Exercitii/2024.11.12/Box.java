/*
* 1. Creează o clasă generică Box care să permită stocarea unui singur element de tip generic.
*/

public class Box<T> {

    T obj;

    Box(T obj) {
        this.obj = obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return this.obj;
    }

}