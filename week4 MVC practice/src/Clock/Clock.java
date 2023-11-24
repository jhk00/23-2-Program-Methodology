package Clock;

public class Clock {
    public static void main(String args[]) {
        View v = new View();
        Model m = new Model();
        new Controller().control(m,v);
    }
}
