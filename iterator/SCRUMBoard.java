package iterator;

/**
 * Represents the SCRUM board
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Creates a SCRUM board
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        todo = new TaskList("TODO");
        doing = new TaskList("DOING");
        done = new TaskList("DONE");
    }

    /**
     * Adds a ticket to the board
     */
    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * Starts a ticket
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);

        if (ticket == null) {
            return false;
        }

        doing.addTicket(ticket);
        return true;
    }

    /**
     * Finishes a ticket
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);

        if (ticket == null) {
            return false;
        }

        done.addTicket(ticket);
        return true;
    }

    /**
     * Displays the SCRUM board
     */
    public String toString() {
        return projectName + "\n\n"
                + todo + "\n"
                + doing + "\n"
                + done;
    }
}