package Clock;
import java.time.*;
public class Controller {
    public void control(Model m, View v) {
    LocalTime t = m.whatTimeIsIt();
    v.show(t);
    v.showSwing(t);
    }
}
// 모델이나 뷰에 대해서 알고 있어야 합니다.