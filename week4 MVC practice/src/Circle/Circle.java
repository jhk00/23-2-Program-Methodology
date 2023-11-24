package Circle;

public class Circle {
    public static void main(String[] args) {
        Model m = new Model();
        Viewin i = new Viewin();
        ViewOut o = new ViewOut();
        new Controller().control(m, i, o);
    }
}
