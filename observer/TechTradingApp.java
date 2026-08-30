package observer;

/**
 * This trading app watches technology stocks.
 */
public class TechTradingApp extends Observer {

    /**
     * Makes technology trading app.
     *
     * @param publisher the stock market being watched
     * @param name the name of the trading app
     */
    public TechTradingApp(Subject publisher, String name) {
        super(publisher, name, Sector.TECHNOLOGY, "\033[33m");
    }
}