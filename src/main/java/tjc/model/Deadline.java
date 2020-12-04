package tjc.model;

import java.util.Date;

public class Deadline {

    public enum Importance { LOW, MEDIUM, HIGH }

    private String name;
    private Importance importance;
    private Date due;

    public Deadline(String name) {
        this.name = name;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public int getHours(Date now) {
        return (int) (now.getTime() - due.getTime()) / (1000 * 3600);
    }

    public String getName() {
        return name;
    }

    public Importance getImportance() {
        return importance;
    }
}
