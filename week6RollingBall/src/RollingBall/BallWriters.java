package RollingBall;
import java.awt.*;
/** BallWriter - 움직이는 공을 그림 */
public class BallWriters {

    private MovingBall ball1;
    private MovingBall ball2;// 공 객체
    private Color color1;
    private Color color2; // 공의 색깔

    /**
     * Constructor BallWriter
     *
     * @param x     - 공 객체
     * @param c1,c2 - 공의 색깔
     */
    public BallWriters(MovingBall x, MovingBall y, Color c1, Color c2) {
        ball1 = x;
        color1 = c1;
        ball2 = y;
        color2 = c2;
    }

    /**
     * paint - 공 그리기
     *
     * @param g - 그래픽스 펜
     */
    public void paintComponent(Graphics g) {
        g.setColor(color1);
        int radius1 = ball1.radius();
        int diameter1 = radius1 * 2;
        g.fillOval(ball1.x_pos() - radius1, ball1.y_pos() - radius1,
                diameter1, diameter1);

        g.setColor(color2);
        int radius2 = ball2.radius();
        int diameter2 = radius2 * 2;
        g.fillOval(ball2.x_pos() - radius2, ball2.y_pos() - radius2,
                diameter2, diameter2);
    }
}
// 자바독 다는거 시험에 나올수도있음 (자바 document)

/**
 * paint - 공 그리기
 *
 * @param g - 그래픽스 펜
 */