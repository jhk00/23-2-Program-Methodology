package counter1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame implements ActionListener{
    private Counter count;
    private JLabel label = new JLabel("count = 0");
    // 레이블이 올라가있는 프로그램
    public CounterFrame(Counter c) {
        count = c;
        Container cp = getContentPane(); // 현재 프레임 가져오기
        cp.setLayout(new FlowLayout());
        // 컨테이너가 가지고 있는 여러 컴퍼넌트를 어떻게 배열할 것이냐에 대한 정책
        // flow -> 차례대로  boarder -> 동서남북  grid -> 행렬모양으로
        cp.add(label); // 라벨을 프레임 컨테이너에 추가
        JButton button = new JButton("OK"); // 단추 ok를 만든다
        cp.add(button); // 단추를 프레임 컨테이너에 추가
        button.addActionListener(this); // 객체를 단추의 이벤트 처리기로 등록
        setTitle("Counter");
        setSize(200,60);
        setVisible(true); //  프레임이나 해당 컴포넌트가 사용자에게 표시
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 창을 닫으면 프로세스 종료
    }

    /**
     * actionPerformed '버튼 누르기' 액션 이벤트를 처리
     *
     * @param e the event to be processed
     * 표사된 후 버튼을 누를때마다 actionPerformed 메서드에서 호출되어 레이블에 텍스트 업데이트
     */
    public void actionPerformed(ActionEvent e) {
        count.increment();
        label.setText("count = " + count.countOf());
    }
    /* 단추 눌림 이벤트가 발생했을 때 무슨 일을 할 지 등록해 두어야 합니다.
❍ 다음 인터페이스를 만족하는 처리기를 구현
public interface ActionListener {
 public void actionPerformed(ActionEvent e);
}
*/

}
