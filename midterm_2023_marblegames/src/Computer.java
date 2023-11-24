public class Computer {
    private int beads; // 컴퓨터 구슬의 수
    public Computer() {
        beads = 10;
    }

    public void addBeads(int n) { beads += n;} // 컴퓨터의 구슬을 n 개 더한다
    public void removeBeads(int n) { beads -= n;} // 컴퓨터의 구슬을 n 개 뺀다
    public int getBeads() { return beads;} // 컴퓨터가 소지한 구슬의 수를 리턴한다
    public boolean lose(){
        return beads==0;
    } // 게임에 패배했는지 여부를 알려준다. (구슬이 없으면 패배)

    public int pickForAttack() {
        int aballs = (int)(Math.random()*5)+1;
        while(aballs >= beads) {
            aballs = (int)(Math.random()*5)+1;
        }
        return aballs;
    } // while문을 사용해 안전한 난수 생성

    public int pickForGuard() {
        int gballs = (int)(Math.random()*6);
        while(gballs >= beads) {
            gballs = (int)(Math.random()*6);
        }
        return gballs;
    }

    public boolean pickEven() {
        int x = (int)(Math.random()*2);
        return x%2 == 0;
    } // 컴퓨터 공격시 선택한 홀/짝을 무작위로 리턴한다.
      // true 는 짝수, false 는 홀수를 의미한다.
}
