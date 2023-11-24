package Clock;
import javax.swing.*;
import java.time.*;
public class View {

    public void show(LocalTime t) {
        System.out.println(t);
    }
    public void showSwing(LocalTime t) {
        JOptionPane.showMessageDialog(null, t);
    }
}
// 모델이나 컨트롤러와 같이 다른 구성 요소들을 몰라야 됩니다.
// 모델이 가지고 있는 정보를 따로 저장해서는 안됩니다.