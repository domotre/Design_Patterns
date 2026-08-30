package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This one manages the stocks by sending updates to the observers.
 */
public class StockMarketPublisher implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Stock> stocks = new HashMap<String, Stock>();

    /**
     * Adds an observer.
     *
     * @param observer the observer to add
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Takes away an observer.
     *
     * @param observer the observer to remove
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Adds a stock to the stock market.
     *
     * @param symbol the stock symbol
     * @param companyName the company name
     * @param sector the stock sector
     * @param price the stock price
     */
    public void addStock(String symbol, String companyName,
            Sector sector, double price) {
        Stock stock = new Stock(symbol, companyName, sector, price);
        stocks.put(symbol, stock);
    }

    /**
     * Changes the price of the stock.
     *
     * @param symbol the symbol for the stock
     * @param change the price change
     */
    public void updateStock(String symbol, double change) {
        Stock stock = stocks.get(symbol);

        if (stock != null) {
            stock.updatePrice(change);

            Direction direction;

            if (change > 0) {
                direction = Direction.UP;
            } else {
                direction = Direction.DOWN;
            }

            notifyObservers(stock, direction);
        }
    }

    /**
     * Sends an update to the observers.
     *
     * @param stock the stock that changed
     * @param direction if the price went up or down
     */
    @Override
    public void notifyObservers(Stock stock, Direction direction) {
        for (Observer observer : observers) {
            observer.update(stock, direction);
        }
    }
}