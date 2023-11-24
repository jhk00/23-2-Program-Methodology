package Circle;

public class Controller {
   public void control(Model m, Viewin i, ViewOut o) {
      String message = "반지름을 주시면 원의 면적을 계산해드립니다.";
   int radius = i.getNumber(message);
   double area = m.areaCircle(radius);
   o.show(radius,area);
   }
}
