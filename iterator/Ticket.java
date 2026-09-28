package iterator;

/**
 * Represents a ticket on the board
 */
public class Ticket {
    private String name;
    private String teamMember;
    private Difficulty difficulty;

    /**
     * Creates a ticket
     */
    public Ticket(String name, String teamMember, Difficulty difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Gets the ticket name
     */
    public String getName() {
        return name;
    }

    /**
     * Displays the ticket
     */
    public String toString() {
        return difficulty.ASCII + name + " - " + teamMember + "\u001B[0m";
    }
}