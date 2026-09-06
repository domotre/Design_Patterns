package decorator;

import java.util.ArrayList;

/**
 * Adds gear to a player.
 */
public abstract class GearAdder extends Player {

    /**
     * Creates a gear adder for the given player.
     *
     * @param player the player receiving the gear
     * @param gear the gear being added
     */
    public GearAdder(Player player, ArrayList<String> gear) {
        super(new ArrayList<String>(player.character), player.getName());
        addGear(gear);
    }

    /**
     * Adds gear to the player's character.
     *
     * @param gear the gear being added
     */
    protected void addGear(ArrayList<String> gear) {
        for (int i = 0; i < gear.size(); i++) {
            String playerLine = character.get(i);
            String gearLine = gear.get(i);
            String newLine = "";

            int length = Math.max(playerLine.length(), gearLine.length());

            for (int j = 0; j < length; j++) {
                char playerChar = ' ';
                char gearChar = ' ';

                if (j < playerLine.length()) {
                    playerChar = playerLine.charAt(j);
                }

                if (j < gearLine.length()) {
                    gearChar = gearLine.charAt(j);
                }

                if (gearChar != ' ') {
                    newLine += gearChar;
                } else {
                    newLine += playerChar;
                }
            }

            character.set(i, newLine);
        }
    }
}