public class BlackjackCard extends Card {
    Card card = new Card(suitNumber, rankNumber);

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    public int getValue() {
        if (rankNumber == 1) {
            return 11;
        } else if (rankNumber == 11 || rankNumber == 12 || rankNumber == 13) {
            return 10;
        } else {
            return rankNumber;
        }
    }

    public boolean isAce() {
        if (rankNumber == 1) {
            return true;
        } return false;
    }
}
