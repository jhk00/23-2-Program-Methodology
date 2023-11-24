package RollingBall;

public class BounceControllers {
    private MovingBall ball1;
    private MovingBall ball2; // 공 객체 (Model)
    private AnimationWriters writer; // 애니메이션 객체 (Output-View)






    /** Constructor BounceController 컨트롤러 초기화
     * @param b - 공 객체 (Model)
     * @param w - 애니메이션 객체 (Output-View)  */
    public BounceControllers(MovingBall b1, MovingBall b2, AnimationWriters w) {
        ball1 = b1;
        ball2 = b2;
        writer = w;
    }

    /** runAnimation - 내부 시계를 활용하여 애니메이션 구동 */
    public void runAnimation() {
        int time_unit = 1;    // 애니메이션 스텝의 시간 단위
        int painting_delay = 20;  // 다시 그리기 사이의 지연 시간 간격
        while (true) {
            delay(painting_delay);
            ball1.move(time_unit);
            writer.repaint();
            delay(painting_delay);
            ball2.move(time_unit);
            writer.repaint();
            System.out.println(ball2.x_pos() + ", " + ball2.y_pos());

            double dx = ball2.x_pos() - ball1.x_pos();
            double dy = ball2.y_pos() - ball1.y_pos();
            double distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
            if(distance <= Math.min(ball1.radius(),ball2.radius())) { System.out.println("충돌! 종료"); System.exit(1);}
        }
    }

    /** delay - how_long millisecond 동안 실행 정지  */
    private void delay(int how_long) {
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }
}
