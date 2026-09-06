package decorator;

/**
 * Adds a shield to a player.
 */
public class Shield extends GearAdder {

    /**
     * Creates a shield for the given player.
     *
     * @param player the player receiving the shield
     */
    public Shield(Player player) {
        super(player, FileReader.getLines("decorator/shield.txt"));
    }
}