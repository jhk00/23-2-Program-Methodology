import javax.swing.*;

/** VoteCOunt 투표 어플리케이션 */
public class VoteCount {
    public static void main(String[] args) {
        int num_candidates = 4;
        int[] votes = new int[num_candidates]; // 0으로 자동 초기화

        boolean processing = true;

        while(processing) {
            /* loop invariant: 기표수는 해당 배열에 후보자별로 누적되었음*/
            String input = JOptionPane.showInputDialog("원하는 후보에 투표하세요: 0,1,2,3");
            // 이 대화상자에서 cancel을 누르면 input이 null을 반환하게 되고,
            // processing 변수가 false가 되어 루프를 빠져나오게 됩니다.
            if(input == null) processing = false;
            else {
                char vote = input.charAt(0);
                // char -> 단 한글자만 저장할 수 있는 변수
                // charAt(0) -> String으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 변환해주는 녀석이다.
                // int v = Integer.parseInt(input); 로 input을 인티저형으로 바꿔서 사용해도됨
                if('0' <= vote && vote <= '3') {
                    int voted = vote - '0';
                    votes[voted] += 1;
                }
                else
                    System.out.println(input + "은 후보자가 아닙니다.");
            }
        }
        for (int i = 0; i != votes.length; i++) System.out.println("후보 " + i + "번이" + votes[i] + "표를 득표하였습니다.");
    }
}
