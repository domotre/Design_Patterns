package decorator;

/**
 * Represents the base warrior player.
 */
public class Warrior extends Player {

    /**
     * Creates a warrior with the given name.
     *
     * @param name the warrior's name
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/warrior.txt"), name);
    }
}