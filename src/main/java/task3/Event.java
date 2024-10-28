package task3;

/**
 * @author Zbigniew Lemiesz
 */
public class Event implements Comparable<Event> {
    public float km;
    public boolean isIn;

    public Event(float km, boolean isIn) {
        this.km = km;
        this.isIn = isIn;
    }

    @Override
    public String toString() {
        return "Event{km=" + km +", isIn=" + isIn +'}';
    }

    @Override
    public int compareTo(Event e) {
        return Float.compare(this.km, e.km);
    }
}
