package decorator;

/**
 * Adds armor to a player.
 */
public class Armor extends GearAdder {

    /**
     * Creates armor for the given player.
     *
     * @param player the player receiving the armor
     */
    public Armor(Player player) {
        super(player, FileReader.getLines("decorator/armor.txt"));
    }
}