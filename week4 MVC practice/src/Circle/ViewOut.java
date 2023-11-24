package Circle;
import javax.swing.*;
import java.text.*;
public class ViewOut {
    public void show(int radius, double area) {
        System.out.println("반지름이 " + radius + "인 원의 면적은 ");
        DecimalFormat f = new DecimalFormat("0.00");
        System.out.println(f.format(area) + "입니다.");
    }


}
