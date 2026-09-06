package decorator;

/**
 * Adds a sword to a player.
 */
public class Sword extends GearAdder {

    /**
     * Creates a sword for the given player.
     *
     * @param player the player receiving the sword
     */
    public Sword(Player player) {
        super(player, FileReader.getLines("decorator/sword.txt"));
    }
}