import javax.swing.*;
public class Registrar {
    public Registrar() {

    }

    // 홀수면 false, 짝수면 true를 리턴
    public boolean chooseEven() {
        boolean processing = true;
        boolean even = true;
        while (processing) {
            String input = JOptionPane.showInputDialog(null,
                    "홀은 0, 짝은 1을 입력.");
            input = input.trim();
            if (input.equals("홀")) {
                even = false;
                break;
            } else if (input.equals("짝")) {
                even = true;
                break;
            }
        }
        return even;
    }

    // max는 플레이어가 현재 가진 구슬의 수와 컴퓨터가 현재 가진 구슬의 수 중 작은 값
    public int chooseForAttack(int max) {
        boolean processing = true;
        int b = 0;
        while (processing) {
            String input = JOptionPane.showInputDialog("최소 1개에서 최대 5개까지의 공격을 위한 구슬의 개수를 선택해주세요.");
            int a = Integer.parseInt(input);
            if (a <= max) {
                processing = false;
                b = a;
            }
        }
        return b;
    }

    public int chooseForGuard(int max) {
        boolean processing = true;
        int b = 0;
        while (processing) {
            String input = JOptionPane.showInputDialog("최소 0개에서 최대 5개까지의 방어를 위한 구슬의 개수를 선택해주세요.");
            int a = Integer.parseInt(input);
            if (a <= max) {
                processing = false;
                b = a;
            }
        }
        return b;
    }
}