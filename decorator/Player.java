package decorator;

import java.util.ArrayList;

/**
 * Represents a player with a name and character.
 */
public class Player {
    protected String name;
    protected ArrayList<String> character;

    /**
     * Creates a player with the given character and name.
     *
     * @param character the character design
     * @param name the player's name
     */
    public Player(ArrayList<String> character, String name) {
        this.character = character;
        this.name = name;
    }

    /**
     * Gets the player's name.
     *
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the player's name and character.
     *
     * @return the player as a string
     */
    public String toString() {
        String result = "##### " + name + " #####\n";

        for (String line : character) {
            result += line + "\n";
        }

        return result;
    }
}