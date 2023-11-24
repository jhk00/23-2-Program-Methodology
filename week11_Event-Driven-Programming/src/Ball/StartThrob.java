package Ball;

public class StartThrob {
    public static void main(String[] a) {
        int frame_size = 180;
        int pause_time = 500;
        ThrobbingBall b = new ThrobbingBall();
        ThrobPanel p = new ThrobPanel(frame_size, b);
        ThrobFrame f = new ThrobFrame(frame_size, p, new ColorButton(p));
        new ThrobController(p, b, pause_time).run();
    }
}
