package RollingBall;
import java.awt.*;
/** BallWriter - 움직이는 공을 그림 */
public class BallWriter {

    private MovingBall ball; // 공 객체
    private Color color;     // 공의 색깔

    /** Constructor BallWriter
     * @param x - 공 객체
     * @param c - 공의 색깔 */
    public BallWriter(MovingBall x, Color c) {
        ball = x;
        color = c;
    }

    /** paint - 공 그리기
     * @param g - 그래픽스 펜  */
    public void paintComponent(Graphics g) {
        g.setColor(color);
        int radius = ball.radius();
        int diameter = radius * 2;
        g.fillOval(ball.x_pos() - radius, ball.y_pos() - radius,
                diameter, diameter);
    }
}
