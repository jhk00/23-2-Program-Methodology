import javax.swing.*;

public class Registrar {

    public boolean chooseEven(){
        String input_line = JOptionPane.showInputDialog("홀 / 짝 중 골라주세요.").trim();
        while (!input_line.equals("짝") && !input_line.equals("홀")){
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 골라주세요.");
            input_line = JOptionPane.showInputDialog("홀 / 짝 중 골라주세요.").trim();
        }
        if (input_line.equals("짝"))
            return true;
        else
            return false;
    }

    public int chooseForAttack(int max){
        int input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));

        while(!(input_line <= 5 && input_line > 0 && input_line <= max) ) {
            if (input_line > max) {
                JOptionPane.showMessageDialog(null, "구슬 수가 부족합니다.");
                input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));
            } else if (input_line > 5 || input_line <= 0) {
                JOptionPane.showMessageDialog(null, "한번에 집을 수 있는 구슬 수는 1개 이상 5개 이하입니다.");
                input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));
            }
        }
        return input_line;
    }

    public int chooseForGuard(int max) {
        int input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));

        while(!(input_line <= 5 && input_line >= 0 && input_line <= max) ) {
            if (input_line > max) {
                JOptionPane.showMessageDialog(null, "구슬 수가 부족합니다.");
                input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));
            } else if (input_line > 5 || input_line < 0) {
                JOptionPane.showMessageDialog(null, "한번에 집을 수 있는 구슬 수는 0개 이상 5개 이하입니다.");
                input_line = Integer.parseInt(JOptionPane.showInputDialog("몇 개의 구슬을 집으시겠습니까?"));
            }
        }
        return input_line;
    }
}
