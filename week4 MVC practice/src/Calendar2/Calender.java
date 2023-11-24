package Calendar2;

public class Calender {
    public static void main(String[] args) {
        Model m = new Model();
        ViewIn in = new ViewIn();
        ViewOut out = new ViewOut();
        new Controller().control(m,in,out);
    }
}
