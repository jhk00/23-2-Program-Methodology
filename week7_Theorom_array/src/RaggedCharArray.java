import javax.swing.*;
public class RaggedCharArray {
    public static void main(String[] args) {
        int max_words = 20;
        char[][] word = new char[max_words][];
        int count = 0;
        boolean processing = true;
        while ( processing && count < max_words ) {
        String s = JOptionPane.showInputDialog("단어를 입력하세요.");
        if(s.equals("")) processing = false;
        else {
            word[count] = new char[s.length()];
            for(int i = 0; i < s.length(); i++) word[count][i] = s.charAt(i);
            count++;
        }
        }
    }
}
