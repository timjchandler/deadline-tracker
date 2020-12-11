package tjc.model;

public class Deadline {

    public enum Importance { LOW, MEDIUM, HIGH }

    private String name;
    private Importance importance;
    private int day;
    private int month;
    private int year;

    public Deadline(int year, int month, int day) {
        this.day = day;
        this.month = month + 1;
        this.year = year;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public Importance getImportance() {
        return importance;
    }

    @Override
    public String toString() {
        return "Deadline{day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
