public class Player {
    private int beads; // 플레이어가 소지한 구슬의 수이다. 생성자 메소드에서 10으로 초기화한다.

    public Player() {
        beads = 10;
    }

    public void addBeads(int n) { beads += n;} // 플레이어의 구슬을 n 개 더한다
    public void removeBeads(int n) { beads -= n;} // 플레이어의 구슬을 n 개 뺀다
    public int getBeads() { return beads;} // 플레이어가 소지한 구슬의 수를 리턴한다
    public boolean lose(){
        return beads == 0;
    } // 게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)
}
