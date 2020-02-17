public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        if (retailPrice < 0 || 100 < retailPrice) {
            this.retailPrice = 0;
        }
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
