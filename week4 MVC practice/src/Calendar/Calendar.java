package Calendar;

public class Calendar {
    public static void main(String[] args) {
        Model m = new Model();
        ViewOut v = new ViewOut();
        new Controller().control(m,v);
    }
}
