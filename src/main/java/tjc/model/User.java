package tjc.model;

import java.util.ArrayList;

public class User {

    private ArrayList<Deadline> deadlines;

    public User(String name) {
        deadlines = new ArrayList<>();
    }

    public boolean isEmpty() {
        return deadlines.size() == 0;
    }

    public void addDeadline(Deadline deadline) {
        deadlines.add(deadline);
    }

}
