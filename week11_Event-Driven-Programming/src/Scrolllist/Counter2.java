package Scrolllist;

public class Counter2 extends Counter {

    private int index;

    public Counter2(int n, int i) {
        super(n);
        index = i;
    }

    public String toString() {
        return "Counter " + index + " has " + countOf();
    }
}
