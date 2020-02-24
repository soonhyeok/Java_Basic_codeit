public class Card {
    public final int suitNumber; // 카드모양 (1,2,3,4 - 클로버, 하트, 다이아몬드, 스페이드)
    public final int rankNumber; // 카드의 값 (1,11,12,13 - Ace, Jack, Queen, King)

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        switch(this.suitNumber) {
            case 1:
                return "Club";
            case 2:
                return "Heart";
            case 3:
                return "Diamond";
            case 4:
                return "Spade";
        }
        return "";
    }

    public String getRank() {
        switch(this.rankNumber) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
        }
        return Integer.toString(this.rankNumber);
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
