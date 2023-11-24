import javax.swing.*;

public class Registrar {
    public boolean chooseEven() {
        String input = JOptionPane.showInputDialog("홀일까요? 짝일까요?").trim();
        while (!(input.equals("홀") || input.equals("짝"))) {
            System.out.println("잘못된 입력입니다.");
            input = JOptionPane.showInputDialog("홀일까요? 짝일까요?").trim();
        }
        System.out.println("당신은 " + input + "을 선택했습니다.");
        return input.equals("짝");
    }

    public int chooseForAttack(int max) {
        int amount = 0;
        while (true) {
            String input = JOptionPane.showInputDialog("구슬을 몇 개 집을까요?");
            if (input == null) {
                System.out.println("게임이 종료되었습니다.");
                System.exit(0);
            }
            try {
                amount = Integer.parseInt(input);
                if ((amount >= 1 && amount <= 5) && amount <= max) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
        return amount;
    }

    public int chooseForGuard(int max) {
        int amount = 0;
        while (true) {
            String input = JOptionPane.showInputDialog("구슬을 몇 개 집을까요?");
            if (input == null) {
                System.out.println("게임이 종료되었습니다.");
                System.exit(0);
            }
            try {
                amount = Integer.parseInt(input);
                if ((amount >= 0 && amount <= 5) && amount <= max) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
            }
        }
        return amount;
    }

    public Registrar() {

    }
}
