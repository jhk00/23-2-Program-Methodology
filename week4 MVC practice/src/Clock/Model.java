package Clock;
import java.time.*;
public class Model {
    public LocalTime whatTimeIsIt() {
       return LocalTime.now(); // 일단 keep -> 자료형이 클래스 이름? 지피티에서는 가능하다고함
    }
}
// 뷰나 컨트롤러에 대해서 어떤 정보도 알지 말아야 합니다.