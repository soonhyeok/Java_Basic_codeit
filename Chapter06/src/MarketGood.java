public class MarketGood {
    public final String name; // 제품명
    public final int retailPrice; // 정가
    private int discountRate;

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public int getDiscountedPrice() {
        return retailPrice * (100 - discountRate ) / 100;
    }
}