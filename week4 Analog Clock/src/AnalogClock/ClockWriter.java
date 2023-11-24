package AnalogClock;
import javax.swing.*;
import java.awt.*;
import java.time.*;
public class ClockWriter extends JPanel {
    private final int SIZE;
    private int CSIZE;
    public ClockWriter(int n) {
        SIZE = n;
        JFrame frame = new JFrame();
        frame.setTitle("Clock");
        frame.setSize(SIZE+50,SIZE+150);
        frame.getContentPane().add(this);
        // 도화지 역할을 하는 ClockWriter(JPanel) 객체를 담아서 프레임에 끼울 Container 객체가 필요하다.
        //frame.getContentPane()와 같은 형식으로 JFrame 객체 frame에 요청하면 Container 객체를 하나 만들어 내준다.
        // 이 Container 객체에 ClockWriter(JPanel) 객체를 담는 작업은 연이어 기술한 .add(this)가 해준다.
        // this를 Container 객체에 담아 달라는 요청이다. 여기서 this는 미리 정해둔 키워드로 객체 자신을 나타낸다.
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        // Graphics g -> java.awt 패키지에 준비되어있는 것. 도형을 그리는 펜의 역할
        g.setColor(Color.BLUE);
        g.drawString("TIME IS GOLD", 105, 50);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(25,100,SIZE,SIZE);
        // 현재시간 알아보기
        LocalTime now = LocalTime.now();
        // 시계 중심
        int radius = SIZE / 2;
        int x1 = 25 + radius;
        int y1 = 100 + radius;
        // 초단위로 커지는 동심원 그리기
        g.setColor(Color.PINK);
        g.fillOval(x1-CSIZE/2,y1-CSIZE/2,CSIZE,CSIZE);
        CSIZE += radius * now.getSecond()/60;


        // 분침 그리기
        radius -= 30;
        double minute_angle = (now.getMinute()-15) * Math.PI / 30;
        // 일단 2PI(360도) / 60 = 6도/1min 이 나옴. (분당 6도)
        // 그게 이제 PI/30 이 된것. 그래서 PI/30 ( 6도/1min) 에서 분 만큼 곱해주면 angle 나오는거)
        // 여기서 15분은 왜 뺴느냐? -> 시계상에서 시작 각도가 3시를 0도로 하기 때문. 15분을 빼지 않으면 15*6=90도만큼 값이 더 크게나옴.
        int x2 = x1 + (int)(radius * Math.cos(minute_angle));

        int y2 = y1 + (int)(radius * Math.sin(minute_angle));
        g.setColor(Color.RED);
        g.drawLine(x1, y1, x2, y2);
        // 시침 그리기
        radius -= 30;
        double hour_angle = (now.getHour()-3) * Math.PI / 6 + minute_angle / 12;
        // minute_angle / 12 -> 시침이 다음시간으로 갈때 움직인 각도 -> 30도를 60min에 나눠서 움직여야함
        // 그러므로 minute_angle은 60min 기준, 거기서 또 12를 나눈 한시간을 기준으로 시침이 미세하게 움직여야 하니 12를 나눠준것을 더한거다.
        x2 = x1 + (int)(radius * Math.cos(hour_angle));
        y2 = y1 + (int)(radius * Math.sin(hour_angle));
        g.setColor(Color.YELLOW);
        g.drawLine(x1, y1, x2, y2);
    }

    // test code
    public static void main(String[] args) {
        new ClockWriter(250);
    }
}