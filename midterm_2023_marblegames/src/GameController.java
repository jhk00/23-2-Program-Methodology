import javax.swing.*;
public class GameController {
    Player player;
    Computer computer;
    Registrar registrar;

    public GameController(Player p, Computer c, Registrar r) {
        player = p;
        computer = c;
        registrar = r;
    }

    public void playerTurn() {
        String decision; // player의 짝,홀 판정
        System.out.println("* 당신의 공격!");
        int cball = computer.pickForGuard();
        int pball=  registrar.chooseForAttack(Math.min(player.getBeads(),computer.getBeads()));
        System.out.println("당신은 " + pball + "개의 구슬을 집었습니다.");
        boolean pchoose = registrar.chooseEven();
        if(pchoose) { decision = "짝";} else { decision = "홀";}
        System.out.println("당신은 " + decision + "을 선택했습니다.");
        System.out.println("컴퓨터가 손을 폅니다...");
        System.out.println(cball + "개의 구슬입니다!");
       if(cball%2 == 0 && pchoose || cball%2 == 1 && !pchoose )
       { computer.removeBeads(cball); player.addBeads(cball);
           System.out.println("당신이 이겼습니다. 구슬 획득! : " + cball); }
       else { player.removeBeads(pball); computer.addBeads(pball);
           System.out.println("당신이 졌습니다. 구슬 제출! : " + pball);
       }
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());

    }
    public void computerTurn() {
        String decision; // Computer의 짝,홀 판정
        System.out.println("* 컴퓨터의 공격!");
        int pball = registrar.chooseForGuard(player.getBeads());
        System.out.println("당신은 " + pball + "개의 구슬을 집었습니다.");
        int cball = computer.pickForAttack();
        System.out.println("컴퓨터가 " + cball + "개의 구슬을 집어듭니다...");
        boolean cchoose = computer.pickEven();
        if(cchoose) { decision = "짝";} else { decision = "홀";}
        System.out.println("컴퓨터가 " + decision + "을 선택합니다...");
        if(pball%2 == 0 && cchoose || pball%2 == 1 && !cchoose )
        { player.removeBeads(pball); computer.addBeads(pball);
            System.out.println("당신이 졌습니다. 구슬 제출! : " + pball);
        }
        else { computer.removeBeads(cball); player.addBeads(cball);
            System.out.println("당신이 이겼습니다. 구슬 획득! : " + cball);
        }
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + computer.getBeads());
    }
    public void play() {
        System.out.println("게임을 시작합니다...");
        System.out.println("당신의 구슬 : " + player.getBeads());
        System.out.println("컴퓨터의 구슬 : " + player.getBeads());
        boolean processing = true;
        while(processing) {
            playerTurn();
            if (player.lose() || computer.lose()) {processing = false; break;}
            computerTurn();
            if (player.lose() || computer.lose()) {processing = false; break;}
        }
        if(player.lose()) { System.out.println(" 아쉽습니다.. 당신의 패배입니다.."); }
        else { System.out.println(" 축하합니다! 당신의 승리입니다!"); }
    }

}
