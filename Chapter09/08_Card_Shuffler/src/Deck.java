import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards; // 덱에 있는 카드 보관

    public Deck() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    public void shuffle() {
        Random random = new Random();

        for (int i = 0; i <cards.size(); i++) {
            int randint = random.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(randint));
            cards.set(randint, temp);
        }
    }

    public Deck deal(int count) {
        Deck hand = new Deck();

        if (count == 5) {
            for (int i = 0; i < count; i++) {
                hand.addCard(cards.remove(i));
            }
        }
        return hand;
    }
}