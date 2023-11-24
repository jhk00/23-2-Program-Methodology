public class Player {

    private int beads;

    public Player(int n){
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
}
