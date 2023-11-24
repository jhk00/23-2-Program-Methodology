package RollingBall;
import java.awt.*;
public class BoxWriter {
    private Box box;   // 상자 객체

    /** Constructor BoxWriter
     * @param b - 상자 객체 */
    public BoxWriter(Box b) {
        box = b;
    }

    /** paint - 상자 그리기
     * @param g - 그래픽스 펜 */
    public void paintComponent(Graphics g) {
        int size = box.size();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, size, size);
    }
}
