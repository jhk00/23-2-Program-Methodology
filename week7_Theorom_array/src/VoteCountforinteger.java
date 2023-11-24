import javax.swing.*;

public class VoteCountforinteger {
    public static void main(String[] args) {
        int[] votes = new int[4];
        boolean processing = true;
        while(processing) {
            String input = JOptionPane.showInputDialog("원하는 후보에 투표하세요: 0, 1, 2, 3");
            if(input == null)  processing = false;
            else {
                int v = Integer.parseInt(input);
                if (v >= 0 && v < votes.length) votes[v]++;
                else System.out.println("올바른 후보에 투표하세요.");
            }
            // 여기서 else문으로 안묶어줬을때의 오류 -> input변수가 null일때 processing = false가 됨.
            // false가 됬다고 바로 탈출하는게 아님(break문을 걸어준게 아니니) -> else 를 안묶어준 상태니
            // 그대로 loop를 타고 내려가서 끝까지 찍고 탈출하는 거임. 그래서 input변수가 null인 상태로
            // 조건문의 parseInt를 돌리니 오류가 난것.
        }
        for(int i = 0; i < votes.length; i++) {
            System.out.println("후보 " + i + "번이 " + votes[i] + "표를 득표하였습니다.");
        }
    }
}
