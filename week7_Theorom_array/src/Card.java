/*
public class Card {
    public static final String SPADES = "spades";
    public static final String HEARTS = "hearts";
    public static final String DIAMONDS = "diamonds";
    public static final String CLUBS = "clubs";
//필드 변수들 선언
    // statcic 선언 -> 객체에 종속된게 아닌 Card라는 클래스 자체에 종속이 된 것.
    // 접근할때 Card.SPADES 이런식으로 접근 가능
    // object를 new로 생성하지 않아도 static variable에 접근 가능 ( Card 자체에 종속되어 있으니)

    // [ Static 변수 특징 ]
    //Static 변수는 클래스 변수이다.
    //객체를 생성하지 않고도 Static 자원에 접근이 가능하다..
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static final int SIZE_OF_ONE_SUIT = 13;

    private String suit;
    private int rank;
*/
    /** Card의 무의와 등급을 설정
     * @param s - 무늬
     * @param r - 등급  */
/*
    public Card(String s, int r) {
        suit = s;
        rank = r;
    }
 */
    /** 카드의 무늬 리턴 */
    /*
    public String suit() {
        return suit;
    }
*/
    /** 카드의 등급 리턴 */
    /*
    public int rank() {
        return rank;
    }

    public boolean equals(Card c) {
        return suit.equals(c.suit()) && rank == c.rank();
    }
}
*/