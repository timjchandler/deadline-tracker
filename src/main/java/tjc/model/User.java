package tjc.model;

import java.util.ArrayList;

public class User {

    private static ArrayList<Deadline> deadlines;

    public User(String name) {
        deadlines = new ArrayList<>();
    }

    public boolean isEmpty() {
        return deadlines.size() == 0;
    }

    public static void addDeadline(Deadline deadline) {
        deadlines.add(deadline);
    }

    public static void printDeadlines() {
        for (Deadline d: deadlines) System.out.println(d.toString());
    }

}
