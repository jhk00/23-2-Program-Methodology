import java.awt.Color;
import java.util.Random;
public class GameBoard {
    private Cell[][] square;
    private int point; // 드러나있는 칸의 개수

    public Cell[][] square() {
        return square;
    }

    public int point() {
        return point;
    }

    public void upgrade() {
        point += 2;
    }

    public GameBoard() {
        // 2차원 배열 생성
        square = new Cell[4][4];
        // 색깔 8가지 지정하여 배열에 저장
        Color[] colors = {Color.BLUE, Color.CYAN, Color.PINK, Color.RED,
                Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE};
        // 색깔별 2개씩 Cell 객체 만들어 1차원 배열에 저장
        Cell[] twins = createTwinCells(colors);
        // 1차원 배열을 무작위로 섞은 뒤 2차원 배열 square에 재배치
        makeSquare(shuffle(twins));
    }

    private void makeSquare(Cell[] cells) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                square[i][j] = cells[4*i + j];
            }
    } // 1차원 Cell 배열을 필드 변수 square의 2차원 배열에 재배치
        /*  더 나은 코드
         int index = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                square[i][j] = cells[index];
                index += 1;
         */



    private Cell[] createTwinCells(Color[] cs) {
       Cell[] twins = new Cell[cs.length*2];
       int i = 0;
       for(int k = 0; k < cs.length; k++) {
           twins[i] = new cell(cs[k]);
           i += 1;
           twins[i] = new Cell(cs[k]);
           i += 1;
       }
       retrun twins;
        }
    } // 인수 배열로 주어진 색깔별로 2개씩 Cell 객체를 만들어 1차원 배열로 리턴

    private Cell[] shuffle(Cell[] twins) { // cell 배열을 무작위로 섞어서 리턴
        int index;
        Cell temp;
        Random random = new Random();
        for (int i = twins.length - 1; i > 0; i--) {
            index = random.nextInt(i+1);
            temp = twins[index];
            twins[index] = twins[i];
            twins[i] = temp;
        }
        return twins;
    }
}
