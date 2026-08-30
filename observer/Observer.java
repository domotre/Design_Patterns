package observer;

/**
 * This is used for the trading apps that watch stock changes.
 */
public abstract class Observer {
    private String name;
    private Sector sector;
    private String color;

    /**
     * Makes an observer and adds it to the stock market.
     *
     * @param publisher the stock market being watched
     * @param name the name of the trading app
     * @param sector the sector being watched
     * @param color the color used for the app name
     */
    public Observer(Subject publisher, String name, Sector sector, String color) {
        this.name = name;
        this.sector = sector;
        this.color = color;

        publisher.registerObserver(this);

        System.out.println(color + name.toUpperCase()
                + "\033[0m is monitoring the market");
    }

    /**
     * Prints updates for the stocks the app watches.
     *
     * @param stock the stock that changed
     * @param direction if the price went up or down
     */
    public void update(Stock stock, Direction direction) {
        if (stock.getSector() == sector) {
            String arrow;
            String priceColor;

            if (direction == Direction.UP) {
                arrow = "^";
                priceColor = "\033[32m";
            } else {
                arrow = "v";
                priceColor = "\033[31m";
            }

            System.out.println(color + name.toUpperCase()
                    + "\033[0m: " + stock.getCompanyName()
                    + "(" + stock.getSymbol() + ") is now priced at "
                    + priceColor + "$" + stock.getPrice() + " "
                    + arrow + "\033[0m");
        }
    }
}