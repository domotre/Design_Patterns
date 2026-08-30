package observer;

/**
 * This is used to add observers, remove observers, and send them updates.
 */
public interface Subject {

    /**
     * Adds an observer to the list.
     *
     * @param observer the observer to add
     */
    public void registerObserver(Observer observer);

    /**
     * Takes an observer off the list.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(Observer observer);

    /**
     * Lets the observers know when a stock changes.
     *
     * @param stock the stock that changed
     * @param direction if the price went up or down
     */
    public void notifyObservers(Stock stock, Direction direction);
}