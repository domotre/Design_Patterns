package iterator;

/**
 * Holds a list of tickets
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Creates a task list
     */
    public TaskList(String name) {
        this.name = name;
        tickets = new Ticket[10];
        count = 0;
    }

    /**
     * Adds a new ticket
     */
    public void addTicket(String name, String teamMember, Difficulty difficulty) {
        tickets[count] = new Ticket(name, teamMember, difficulty);
        count++;
    }

    /**
     * Adds a ticket
     */
    public void addTicket(Ticket ticket) {
        tickets[count] = ticket;
        count++;
    }

    /**
     * Gets a ticket by name
     */
    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getName().equals(name)) {
                Ticket ticket = tickets[i];

                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }

                tickets[count - 1] = null;
                count--;

                return ticket;
            }
        }

        return null;
    }

    /**
     * Creates an iterator
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * Displays the task list
     */
    public String toString() {
        String result = name + ":\n";
        TaskListIterator iterator = createIterator();

        while (iterator.hasNext()) {
            result += iterator.next() + "\n";
        }

        return result;
    }
}