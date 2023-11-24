package AnalogClockWithCircle;
import javax.swing.*;
import java.awt.*;
import java.time.*;
public class ClockWriter2 extends JPanel {
    private final int SIZE;


    public ClockWriter2(int n) {
        SIZE = n;
       JFrame f = new JFrame();
       f.setTitle("Clock2");
       f.setSize(SIZE,SIZE);
       f.setVisible(true);
       f.getContentPane().add(this);
       f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("TIME IS GOLD", 160, 25);
        /*
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,SIZE,SIZE);
        */
        // 이거랑 겹쳐서 TIME IS GOLD가 출력이 안됨. RECT랑 겹치는 불상사를 피할것
        int width = 270;
        int height = 270;
        int radius = width/2;
        int x1 = 65 + radius;
        int y1 = 65 + radius;
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(65,65, width, height);
        LocalTime L = LocalTime.now();
        // 동심원 설정
        // int cwidth = 0; int cheight = 0; 여기에 변수선언 하면 다시 시작될때마다 0으로 초기화됨
        // 이게 맨 밑으로 가면 동심원이 모든걸 가리게 되어 여기에 설정하는게 맞음
        int second = L.getSecond() * radius / 60;
        // int second -> getSecond에 의해 계속 갱신됨( 애초에 여기 paintComponet 안에 있으면 second는 계속 초기화되니)
        g.setColor(Color.PINK);
        g.fillOval(x1-second,y1-second, second*2, second*2);

        // 분침 설정
        radius -= 30;
        // 위에서 x1은 이미 초기 radius에 의해 계산되었으므로 x1의 값은 변하지 않음.

        double minute_angle = (L.getMinute() - 15) * Math.PI / 30;
        int x2 = x1 + (int)(radius * Math.cos(minute_angle));
        int y2 = y1 + (int)(radius * Math.sin(minute_angle));
        g.setColor(Color.RED);
        g.drawLine(x1,y1,x2,y2);

        //시침 설정
        radius -= 30;
        double hour_angle = (L.getHour() - 3) * Math.PI / 6 + minute_angle / 12;
        int x3 = x1 + (int)(radius * Math.cos(hour_angle));
        int y3 = y1 + (int)(radius * Math.sin(hour_angle));
        g.setColor(Color.YELLOW);
        g.drawLine(x1,y1,x3,y3);





    }

    public static void main (String[] args) {
        new ClockWriter2(400);
    }
}
