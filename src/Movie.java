public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String title, int priceCode) {
        title = title;
        priceCode = priceCode;
    }
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int newPriceCode) {
        priceCode = newPriceCode;
    }
    public String getTitle (){
        return title;
    };
}