import javax.swing.*;
public class Two_Dimensional_Arrays {
    public static void main(String[] args) {
        int[][] election = new int[3][4];

        for(int j = 0; j < 4; j++) {
            int votes = 0;
            for (int i = 0; i < 3; i++) votes = votes + election[i][j];
            System.out.println("기호" + (j + 1) + "번은 " + votes + "표 받았습니다.");
        }
        for(int i = 0; i < 3; i++) {
            int votes = 0;
            for(int j = 0; j < 4; j++) votes = votes + election[i][j];
            System.out.println((i+1) + "학년은 " + votes + "표 행사했습니다.");
        }


    }

}