package RollingBall;

public class MovingBall {
    private int x_pos; // 공의 중심 x 좌표
    private int y_pos; // 공의 중심 y 좌표
    private int radius; // 공의 반지름

    private int x_velocity = +5; // 속도 x축
    private int y_velocity = +2; // 속도 y축

    private double distance_circle;
    private double distance_x_circle;
    private double distance_y_circle;
    private Box container;

    /** Contructor MovingBall - 공 만들기
     * @param x_initial - 공의 중심 x 좌표
     * @param y_initial - 공의 중심 y 좌표
     * @param r - 공의 반지름
     * @param box - 공이 살고 있는 상자 */
    public MovingBall(int x_initial, int y_initial, int r, Box box) {
        x_pos = x_initial;
        y_pos = y_initial;
        radius = r;
        container = box;
    }

    public void setVelocityX(int x_velo){
        x_velocity = x_velo;
    }
    public void setVelocityY(int y_velo){
        y_velocity = y_velo;
    }

    public void collapse() {

    }
    public MovingBall(int x_initial, int y_initial, int r, Box box,int new_x_velocity,int new_y_velocity) {
        x_pos = x_initial;
        x_pos = y_initial;
        radius = r;
        container = box;
        x_velocity = new_x_velocity;
        y_velocity = new_y_velocity;
    }

    /** x_pos - 공의 x축 위치 리턴 */
    public int x_pos() {
        return x_pos;
    }

    /** y_pos - 공의 y축 위치 리턴 */
    public int y_pos() {
        return y_pos;
    }

    /** radius - 공의 반지름 리턴 */
    public int radius() {
        return radius;
    }

    /** move - time_unit 만큼 공을 이동, 벽에 부딪치면 방향을 바꿈
     * @param time_unit - 프레임 사이의 시간 */
    public void move(int time_unit) {
        x_pos += x_velocity * time_unit;
        if (container.inHorizontalContact(x_pos))
            x_velocity = - x_velocity;
        y_pos += y_velocity * time_unit;
        if (container.inVerticalContact(y_pos))
            y_velocity = - y_velocity;
    }
}
