package observer;

/**
 * Has all of the information for one stock.
 */
public class Stock {
    private String symbol;
    private String companyName;
    private Sector sector;
    private double price;

    /**
     * Makes a new stock.
     *
     * @param symbol the stock symbol, such as AAPL
     * @param companyName the company name
     * @param sector the stock sector
     * @param price the stock price
     */
    public Stock(String symbol, String companyName, Sector sector, double price) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.sector = sector;
        this.price = price;
    }

    /**
     * Changes the stock price.
     *
     * @param delta the price change
     */
    public void updatePrice(double delta) {
        price += delta;
    }

    /**
     * Gives back the stock symbol.
     *
     * @return the stock symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gives back the company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Gives back the stock sector.
     *
     * @return the stock sector
     */
    public Sector getSector() {
        return sector;
    }

    /**
     * Gives back the current price.
     *
     * @return the current price
     */
    public double getPrice() {
        return price;
    }
}