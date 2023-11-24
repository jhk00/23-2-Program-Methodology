import java.util.Random;

public class Computer {
    private int beads;

    public Computer(int n){
        beads = n;
    }

    public void addBeads(int n){
        beads = beads + n;
    }

    public void removeBeads(int n){
        beads = beads - n;
    }

    public int getBeads(){
        return beads;
    }

    public boolean lose(){
        return beads == 0;
    }

    public int pickForAttack() {
        int ball = (int)(Math.random()*5) +1;
        return ball;
    }

    public int pickForGuard() {
        int ball = 20;
        while (ball >= beads) {
            ball = (int)(Math.random() * 6);
        }
        return ball;
    }

    public boolean pickEven() {
        int pick = (int)(Math.random() * 2);
        return pick == 1;
    }
}
