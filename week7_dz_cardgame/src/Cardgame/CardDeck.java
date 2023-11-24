package Cardgame;

public class CardDeck {
    private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // 카드 덱
    private int card_count; // 덱에 현재 남아있는 카드의 장수
    // Invariant: deck[0], .., decl[card_count-1] 에 카드가 있다.

    /** CardDeck 카드 한 벌 생성  */
    public CardDeck() {
        createDeck();
    }

    private void createDeck() {
        createSuit(Card.SPADES);
        createSuit(Card.HEARTS);
        createSuit(Card.CLUBS);
        createSuit(Card.DIAMONDS);
    }

    private void createSuit(String which_suit) {
        for(int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i++) {
            deck[card_count] = new Card(which_suit, i);
            card_count = card_count + 1;
        }
    }

    /** 카드 덱에서 무작위로 카드를 한 장 선택하여 내줌
     * @return 카드 덱에서 무작위로 한 장 뽑아줌
     *         없으면 카드 1벌을 새로 만들고 무작위로 한 장 뽑아줌   */
    public Card drawCard() {
        if (card_count == 0) // will never be negative!
            createDeck();
        int the_picked = (int)(Math.random() * card_count);
        Card the_card_drawn = deck[the_picked];
        for (int i = the_picked+1; i < card_count; i++)
            deck[i-1] = deck[i];
        card_count -= card_count;
        return the_card_drawn;
    }
}
// if (card_count == 0) 조건을 체크합니다. 이 조건은 현재 카드 덱에 더 이상 카드가 남아있지 않을 때를 나타냅니다.
// createDeck() 메서드를 호출합니다. 이 메서드는 카드 덱을 새로 만들고 초기화하는 역할을 합니다. 따라서 카드 덱이 비어있을 때 새로운 덱을 생성합니다.
// 무작위로 카드를 선택하기 위해 the_picked 변수를 생성하고, 0부터 현재 카드 덱에 있는 카드 수(card_count) 사이에서 무작위로 값을 선택합니다.
// Math.random() 함수를 사용하여 0 이상 1 미만의 난수를 생성하고, 이를 card_count로 곱하면 0 이상 card_count - 1 사이의 정수가 생성됩니다.
// 선택한 무작위 카드를 deck 배열에서 가져와서 the_card_drawn 변수에 할당합니다.
// 선택한 카드 다음에 있는 카드들을 왼쪽으로 하나씩 이동시켜 빈 칸을 메꿉니다. 이것은 뽑은 카드를 제거하고 카드 덱을 업데이트하는 단계입니다.
// card_count를 0으로 설정하여, 덱에 있는 카드의 개수를 하나 줄입니다. 이로써 뽑힌 카드는 덱에서 제거됩니다.
// 마지막으로, 선택한 카드인 the_card_drawn을 반환합니다.
// 이렇게 하면 drawCard 메서드를 호출할 때마다 무작위로 카드를 하나 뽑을 수 있으며, 덱이 비어있으면 새로운 덱을 만들어 계속해서 카드를 뽑을 수 있습니다.
